/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc2x3javatoolbox.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcApprovalRelationship<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcApprovalRelationship extends InternalAccessClass implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcApproval","IfcApproval","IfcText","IfcLabel"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** RelatedApproval is an DEMANDED attribute - may not be null**/
	protected IfcApproval RelatedApproval;
	/** RelatingApproval is an DEMANDED attribute - may not be null**/
	protected IfcApproval RelatingApproval;
	/** Description is an OPTIONAL attribute**/
	protected IfcText Description;
	/** Name is an DEMANDED attribute - may not be null**/
	protected IfcLabel Name;
	/**
	* The default constructor.
	**/
	public IfcApprovalRelationship(){}

	private static final String[] attributes = new String[]{"RelatedApproval","RelatingApproval","Description","Name"};

	public String[] getAttributes() {
		return IfcApprovalRelationship.attributes;
	}

	/**
	* Constructs a new IfcApprovalRelationship object using the given parameters.
	*
	* @param RelatedApproval DEMANDED parameter of type IfcApproval - may not be null.
	* @param RelatingApproval DEMANDED parameter of type IfcApproval - may not be null.
	* @param Description OPTIONAL parameter of type IfcText
	* @param Name DEMANDED parameter of type IfcLabel - may not be null.
	**/
	public IfcApprovalRelationship(IfcApproval RelatedApproval, IfcApproval RelatingApproval, IfcText Description, IfcLabel Name)
	{
		this.RelatedApproval = RelatedApproval;
		this.RelatingApproval = RelatingApproval;
		this.Description = Description;
		this.Name = Name;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcApprovalRelationship object using the given parameters.
	*
	* @param RelatedApproval DEMANDED parameter of type IfcApproval - may not be null.
	* @param RelatingApproval DEMANDED parameter of type IfcApproval - may not be null.
	* @param Description OPTIONAL parameter of type IfcText
	* @param Name DEMANDED parameter of type IfcLabel - may not be null.
	**/
	public void setParameters(IfcApproval RelatedApproval, IfcApproval RelatingApproval, IfcText Description, IfcLabel Name)
	{
		this.RelatedApproval = RelatedApproval;
		this.RelatingApproval = RelatingApproval;
		this.Description = Description;
		this.Name = Name;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.RelatedApproval = (IfcApproval) parameters.get(0);
		this.RelatingApproval = (IfcApproval) parameters.get(1);
		this.Description = (IfcText) parameters.get(2);
		this.Name = (IfcLabel) parameters.get(3);
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void destruct()
	{
		listenerList = null;
	}

	private void resolveInverses()
	{
		if(RelatedApproval != null)
		{
				if(RelatedApproval.IsRelatedWith_Inverse == null)
				{
					RelatedApproval.IsRelatedWith_Inverse = new SET<IfcApprovalRelationship>();
				}
				RelatedApproval.IsRelatedWith_Inverse.add(this);
		}
		if(RelatingApproval != null)
		{
				if(RelatingApproval.Relates_Inverse == null)
				{
					RelatingApproval.Relates_Inverse = new SET<IfcApprovalRelationship>();
				}
				RelatingApproval.Relates_Inverse.add(this);
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcApprovalRelationship.nonInverseAttributes;	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	private java.util.HashSet<String> getRedefinedDerivedAttributeTypes()
	{
		java.util.HashSet<String> redefinedDerivedAttributes = new java.util.HashSet<String>();
		return redefinedDerivedAttributes;	}

	/**
 * This method returns the object IFC  STEP representation. This method is called by the IfcModel object to write IFC STEP files.
	 *
	 * @return the IFC STEP representation of this object
	**/
	public String getStepLine()
	{
		String stepString = new String("#"+this.stepLineNumber+"= ");
		stepString = stepString.concat("IFCAPPROVALRELATIONSHIP(");
		if(getRedefinedDerivedAttributeTypes().contains("RelatedApproval")) stepString = stepString.concat("*,");
		else{
		if(this.RelatedApproval != null)		stepString = stepString.concat(((RootInterface)this.RelatedApproval).getStepParameter(IfcApproval.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RelatingApproval")) stepString = stepString.concat("*,");
		else{
		if(this.RelatingApproval != null)		stepString = stepString.concat(((RootInterface)this.RelatingApproval).getStepParameter(IfcApproval.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Description")) stepString = stepString.concat("*,");
		else{
		if(this.Description != null)		stepString = stepString.concat(((RootInterface)this.Description).getStepParameter(IfcText.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Name")) stepString = stepString.concat("*);");
		else{
		if(this.Name != null)		stepString = stepString.concat(((RootInterface)this.Name).getStepParameter(IfcLabel.class.isInterface())+");");
		else		stepString = stepString.concat("$);");
		}
		return stepString;
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	public String getStepParameter(boolean isSelectType)
	{
		return "#" + this.stepLineNumber;
	}

	/**
	 * This method returns the line number within a IFC  STEP representation. This method is called from other objects, where this one is referenced.
	 *
	 * @return the STEP line number
	**/
	public int getStepLineNumber()
	{
		return this.stepLineNumber;
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void setStepLineNumber(int number)
	{
		this.stepLineNumber = number;
	}

	/**
	* This method sets the RelatedApproval attribute to the given value.
	*
	* @param RelatedApproval OPTIONAL value to set
	**/
	public void setRelatedApproval(IfcApproval RelatedApproval)
	{
		synchronizeInversesRemoveRelatedApproval(this.RelatedApproval);
		this.RelatedApproval = RelatedApproval;
		synchronizeInversesAddRelatedApproval(this.RelatedApproval);
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RelatedApproval attribute.
	*
	* @return the value of RelatedApproval
	/**/
	public IfcApproval getRelatedApproval()
	{
		return this.RelatedApproval;
	}

	private void synchronizeInversesAddRelatedApproval(IfcApproval RelatedApproval)
	{
		if(RelatedApproval != null)
		{
				if(RelatedApproval.IsRelatedWith_Inverse == null)
				{
					RelatedApproval.IsRelatedWith_Inverse = new SET<IfcApprovalRelationship>();
				}
				RelatedApproval.IsRelatedWith_Inverse.add(this);
		}
	}

	private void synchronizeInversesRemoveRelatedApproval(IfcApproval RelatedApproval)
	{
		if(RelatedApproval != null)
		{
				if(RelatedApproval.IsRelatedWith_Inverse != null)
				{
					RelatedApproval.IsRelatedWith_Inverse.remove(this);
				}
		}
	}

	/**
	* This method sets the RelatingApproval attribute to the given value.
	*
	* @param RelatingApproval OPTIONAL value to set
	**/
	public void setRelatingApproval(IfcApproval RelatingApproval)
	{
		synchronizeInversesRemoveRelatingApproval(this.RelatingApproval);
		this.RelatingApproval = RelatingApproval;
		synchronizeInversesAddRelatingApproval(this.RelatingApproval);
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RelatingApproval attribute.
	*
	* @return the value of RelatingApproval
	/**/
	public IfcApproval getRelatingApproval()
	{
		return this.RelatingApproval;
	}

	private void synchronizeInversesAddRelatingApproval(IfcApproval RelatingApproval)
	{
		if(RelatingApproval != null)
		{
				if(RelatingApproval.Relates_Inverse == null)
				{
					RelatingApproval.Relates_Inverse = new SET<IfcApprovalRelationship>();
				}
				RelatingApproval.Relates_Inverse.add(this);
		}
	}

	private void synchronizeInversesRemoveRelatingApproval(IfcApproval RelatingApproval)
	{
		if(RelatingApproval != null)
		{
				if(RelatingApproval.Relates_Inverse != null)
				{
					RelatingApproval.Relates_Inverse.remove(this);
				}
		}
	}

	/**
	* This method sets the Description attribute to the given value.
	*
	* @param Description DEMANDED value to set - may not be null
	**/
	public void setDescription(IfcText Description)
	{
		this.Description = Description;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Description attribute.
	*
	* @return the value of Description
	/**/
	public IfcText getDescription()
	{
		return this.Description;
	}

	/**
	* This method sets the Name attribute to the given value.
	*
	* @param Name OPTIONAL value to set
	**/
	public void setName(IfcLabel Name)
	{
		this.Name = Name;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Name attribute.
	*
	* @return the value of Name
	/**/
	public IfcLabel getName()
	{
		return this.Name;
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void setStepParameter(java.util.ArrayList<CloneableObject> parameter)
	{
		this.stepParameter = parameter;
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	java.util.ArrayList<CloneableObject> getStepParameter()
	{
		return this.stepParameter;
	}

	/**
	 * This method registers an ObjectChangeListener to this object. An event is fired whenever one of its values was changed.
	 * 
	 *@param listener the listener to register
	**/
	public void addObjectChangeListener(ObjectChangeListener listener)
	{
		if (listenerList == null)	listenerList = new java.util.HashSet<ObjectChangeListener>(1,1);
		listenerList.add(listener);
	}

	/**
	 * This method unregisters an ObjectChangeListener from this object.
	 * 
	 *@param listener the listener to unregister
	**/
	public void removeObjectChangeListener(ObjectChangeListener listener)
	{
		if (listenerList == null)	return;
		listenerList.remove(listener);
		if (listenerList.size()==0) listenerList = null;
	}

	/**
	 * This method removes all currently registered ObjectChangeListeners from this object.
	**/
	public void removeAllObjectChangeListeners()
	{
		listenerList = null;
	}

	protected void fireChangeEvent()
	{
		if(listenerList == null) return;
		for(ObjectChangeListener listener : listenerList)
			listener.ifcModelObjectChange(this);
	}

	/**
	 * This method clones the object (deep cloning).
	 *
	 * @return the cloned object
	**/
	public Object clone()
	{
		IfcApprovalRelationship ifcApprovalRelationship = new IfcApprovalRelationship();
		if(this.RelatedApproval != null)
			ifcApprovalRelationship.setRelatedApproval((IfcApproval)this.RelatedApproval.clone());
		if(this.RelatingApproval != null)
			ifcApprovalRelationship.setRelatingApproval((IfcApproval)this.RelatingApproval.clone());
		if(this.Description != null)
			ifcApprovalRelationship.setDescription((IfcText)this.Description.clone());
		if(this.Name != null)
			ifcApprovalRelationship.setName((IfcLabel)this.Name.clone());
		return ifcApprovalRelationship;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcApprovalRelationship ifcApprovalRelationship = new IfcApprovalRelationship();
		if(this.RelatedApproval != null)
			ifcApprovalRelationship.setRelatedApproval(this.RelatedApproval);
		if(this.RelatingApproval != null)
			ifcApprovalRelationship.setRelatingApproval(this.RelatingApproval);
		if(this.Description != null)
			ifcApprovalRelationship.setDescription(this.Description);
		if(this.Name != null)
			ifcApprovalRelationship.setName(this.Name);
		return ifcApprovalRelationship;
	}

	/**
	* This method returns the objects standard description.
	*
	* @return the standard description
	**/
	public String toString()
	{
		return "#"+ this.getStepLineNumber() + " " + this.getClass().getSimpleName();
	}


}
