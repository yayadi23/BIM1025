/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc2x3javatoolbox.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcRelCoversBldgElements<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcRelCoversBldgElements extends IfcRelConnects implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","IfcElement","SET<IfcCovering>"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** RelatingBuildingElement is an DEMANDED attribute - may not be null**/
	protected IfcElement RelatingBuildingElement;
	/** RelatedCoverings is an DEMANDED attribute - may not be null**/
	protected SET<IfcCovering> RelatedCoverings;
	/**
	* The default constructor.
	**/
	public IfcRelCoversBldgElements(){}

	private static final String[] attributes = new String[]{"GlobalId","OwnerHistory","Name","Description"
			,"RelatingBuildingElement","RelatedCoverings"};

	public String[] getAttributes() {
		return IfcRelCoversBldgElements.attributes;
	}


	/**
	* Constructs a new IfcRelCoversBldgElements object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param RelatingBuildingElement DEMANDED parameter of type IfcElement - may not be null.
	* @param RelatedCoverings DEMANDED parameter of type SET<IfcCovering> - may not be null.
	**/
	public IfcRelCoversBldgElements(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcElement RelatingBuildingElement, SET<IfcCovering> RelatedCoverings)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.RelatingBuildingElement = RelatingBuildingElement;
		this.RelatedCoverings = RelatedCoverings;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcRelCoversBldgElements object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param RelatingBuildingElement DEMANDED parameter of type IfcElement - may not be null.
	* @param RelatedCoverings DEMANDED parameter of type SET<IfcCovering> - may not be null.
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcElement RelatingBuildingElement, SET<IfcCovering> RelatedCoverings)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.RelatingBuildingElement = RelatingBuildingElement;
		this.RelatedCoverings = RelatedCoverings;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.GlobalId = (IfcGloballyUniqueId) parameters.get(0);
		this.OwnerHistory = (IfcOwnerHistory) parameters.get(1);
		this.Name = (IfcLabel) parameters.get(2);
		this.Description = (IfcText) parameters.get(3);
		this.RelatingBuildingElement = (IfcElement) parameters.get(4);
		this.RelatedCoverings = (SET<IfcCovering>) parameters.get(5);
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void destruct()
	{
		 super.destruct();
		listenerList = null;
	}

	private void resolveInverses()
	{
		if(RelatingBuildingElement != null)
		{
				if(RelatingBuildingElement.HasCoverings_Inverse == null)
				{
					RelatingBuildingElement.HasCoverings_Inverse = new SET<IfcRelCoversBldgElements>();
				}
				RelatingBuildingElement.HasCoverings_Inverse.add(this);
		}
		if(RelatedCoverings != null)
		{
			for(IfcCovering RelatedCoverings$ : RelatedCoverings)
			{
				if(RelatedCoverings$.Covers_Inverse == null)
				{
					RelatedCoverings$.Covers_Inverse = new SET<IfcRelCoversBldgElements>();
				}
				RelatedCoverings$.Covers_Inverse.add(this);
			}
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcRelCoversBldgElements.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCRELCOVERSBLDGELEMENTS(");
		if(getRedefinedDerivedAttributeTypes().contains("GlobalId")) stepString = stepString.concat("*,");
		else{
		if(this.GlobalId != null)		stepString = stepString.concat(((RootInterface)this.GlobalId).getStepParameter(IfcGloballyUniqueId.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("OwnerHistory")) stepString = stepString.concat("*,");
		else{
		if(this.OwnerHistory != null)		stepString = stepString.concat(((RootInterface)this.OwnerHistory).getStepParameter(IfcOwnerHistory.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Name")) stepString = stepString.concat("*,");
		else{
		if(this.Name != null)		stepString = stepString.concat(((RootInterface)this.Name).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Description")) stepString = stepString.concat("*,");
		else{
		if(this.Description != null)		stepString = stepString.concat(((RootInterface)this.Description).getStepParameter(IfcText.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RelatingBuildingElement")) stepString = stepString.concat("*,");
		else{
		if(this.RelatingBuildingElement != null)		stepString = stepString.concat(((RootInterface)this.RelatingBuildingElement).getStepParameter(IfcElement.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RelatedCoverings")) stepString = stepString.concat("*);");
		else{
		if(this.RelatedCoverings != null)		stepString = stepString.concat(((RootInterface)this.RelatedCoverings).getStepParameter(IfcCovering.class.isInterface())+");");
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
	* This method sets the RelatingBuildingElement attribute to the given value.
	*
	* @param RelatingBuildingElement OPTIONAL value to set
	**/
	public void setRelatingBuildingElement(IfcElement RelatingBuildingElement)
	{
		synchronizeInversesRemoveRelatingBuildingElement(this.RelatingBuildingElement);
		this.RelatingBuildingElement = RelatingBuildingElement;
		synchronizeInversesAddRelatingBuildingElement(this.RelatingBuildingElement);
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RelatingBuildingElement attribute.
	*
	* @return the value of RelatingBuildingElement
	/**/
	public IfcElement getRelatingBuildingElement()
	{
		return this.RelatingBuildingElement;
	}

	private void synchronizeInversesAddRelatingBuildingElement(IfcElement RelatingBuildingElement)
	{
		if(RelatingBuildingElement != null)
		{
				if(RelatingBuildingElement.HasCoverings_Inverse == null)
				{
					RelatingBuildingElement.HasCoverings_Inverse = new SET<IfcRelCoversBldgElements>();
				}
				RelatingBuildingElement.HasCoverings_Inverse.add(this);
		}
	}

	private void synchronizeInversesRemoveRelatingBuildingElement(IfcElement RelatingBuildingElement)
	{
		if(RelatingBuildingElement != null)
		{
				if(RelatingBuildingElement.HasCoverings_Inverse != null)
				{
					RelatingBuildingElement.HasCoverings_Inverse.remove(this);
				}
		}
	}

	/**
	* This method sets the RelatedCoverings attribute to the given value.
	*
	* @param RelatedCoverings OPTIONAL value to set
	**/
	public void setRelatedCoverings(SET<IfcCovering> RelatedCoverings)
	{
		synchronizeInversesRemoveRelatedCoverings(this.RelatedCoverings);
		this.RelatedCoverings = RelatedCoverings;
		synchronizeInversesAddRelatedCoverings(this.RelatedCoverings);
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the set of the RelatedCoverings attribute.
	*
	* @return a copy of the RelatedCoverings set
	**/
	public SET<IfcCovering> getRelatedCoverings()
	{
		if(this.RelatedCoverings != null)
			return new SET<IfcCovering>(this.RelatedCoverings);
		return null;
	}

	/**
	* This method adds an IfcCovering object to the RelatedCoverings set.
	* @param RelatedCoverings element to be appended to this set.
	**/
	public void addRelatedCoverings(IfcCovering RelatedCoverings)
	{
		if(this.RelatedCoverings == null)
			this.RelatedCoverings = new SET<IfcCovering>();
		this.RelatedCoverings.add(RelatedCoverings);
		synchronizeInversesAddRelatedCoverings(RelatedCoverings);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcCovering objects to the RelatedCoverings set.
	* @param RelatedCoverings collection containing elements to be added to this set.
	**/
	public void addAllRelatedCoverings(java.util.Collection<IfcCovering> RelatedCoverings)
	{
		if(this.RelatedCoverings == null)
			this.RelatedCoverings = new SET<IfcCovering>();
		this.RelatedCoverings.addAll(RelatedCoverings);
		synchronizeInversesAddRelatedCoverings(RelatedCoverings);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the RelatedCoverings set.
	**/
	public void clearRelatedCoverings()
	{
		if(this.RelatedCoverings != null)
		{
			synchronizeInversesRemoveRelatedCoverings(this.RelatedCoverings);
			this.RelatedCoverings.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcCovering object from the RelatedCoverings set.
	* @param RelatedCoverings element to be removed from this set.
	**/
	public void removeRelatedCoverings(IfcCovering RelatedCoverings)
	{
		if(this.RelatedCoverings != null)
		{
			this.RelatedCoverings.remove(RelatedCoverings);
			synchronizeInversesRemoveRelatedCoverings(RelatedCoverings);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcCovering objects from the RelatedCoverings set.
	* @param RelatedCoverings collection containing elements to be removed from this set.
	**/
	public void removeAllRelatedCoverings(java.util.Collection<IfcCovering> RelatedCoverings)
	{
		if(this.RelatedCoverings != null)
		{
			this.RelatedCoverings.removeAll(RelatedCoverings);
			synchronizeInversesRemoveRelatedCoverings(RelatedCoverings);
			fireChangeEvent();
		}
	}

	private void synchronizeInversesAddRelatedCoverings(IfcCovering RelatedCoverings)
	{
		if(RelatedCoverings != null)
		{
				if(RelatedCoverings.Covers_Inverse == null)
				{
					RelatedCoverings.Covers_Inverse = new SET<IfcRelCoversBldgElements>();
				}
				RelatedCoverings.Covers_Inverse.add(this);
		}
	}

	private void synchronizeInversesAddRelatedCoverings(java.util.Collection<IfcCovering> RelatedCoverings)
	{
		if(RelatedCoverings != null)
		{
			for(IfcCovering RelatedCoverings$ : RelatedCoverings)
			{
				synchronizeInversesAddRelatedCoverings(RelatedCoverings$);
			}
		}
	}

	private void synchronizeInversesRemoveRelatedCoverings(IfcCovering RelatedCoverings)
	{
		if(RelatedCoverings != null)
		{
				if(RelatedCoverings.Covers_Inverse != null)
				{
					RelatedCoverings.Covers_Inverse.remove(this);
				}
		}
	}

	private void synchronizeInversesRemoveRelatedCoverings(java.util.Collection<IfcCovering> RelatedCoverings)
	{
		if(RelatedCoverings != null)
		{
			for(IfcCovering RelatedCoverings$ : RelatedCoverings)
			{
				synchronizeInversesRemoveRelatedCoverings(RelatedCoverings$);
			}
		}
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
	@SuppressWarnings("unchecked")
	public Object clone()
	{
		IfcRelCoversBldgElements ifcRelCoversBldgElements = new IfcRelCoversBldgElements();
		if(this.GlobalId != null)
			ifcRelCoversBldgElements.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcRelCoversBldgElements.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcRelCoversBldgElements.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcRelCoversBldgElements.setDescription((IfcText)this.Description.clone());
		if(this.RelatingBuildingElement != null)
			ifcRelCoversBldgElements.setRelatingBuildingElement((IfcElement)this.RelatingBuildingElement.clone());
		if(this.RelatedCoverings != null)
			ifcRelCoversBldgElements.setRelatedCoverings((SET<IfcCovering>)this.RelatedCoverings.clone());
		return ifcRelCoversBldgElements;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcRelCoversBldgElements ifcRelCoversBldgElements = new IfcRelCoversBldgElements();
		if(this.GlobalId != null)
			ifcRelCoversBldgElements.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcRelCoversBldgElements.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcRelCoversBldgElements.setName(this.Name);
		if(this.Description != null)
			ifcRelCoversBldgElements.setDescription(this.Description);
		if(this.RelatingBuildingElement != null)
			ifcRelCoversBldgElements.setRelatingBuildingElement(this.RelatingBuildingElement);
		if(this.RelatedCoverings != null)
			ifcRelCoversBldgElements.setRelatedCoverings(this.RelatedCoverings);
		return ifcRelCoversBldgElements;
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
