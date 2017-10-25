/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc2x3javatoolbox.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcRelSpaceBoundary<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcRelSpaceBoundary extends IfcRelConnects implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","IfcSpace","IfcElement","IfcConnectionGeometry","IfcPhysicalOrVirtualEnum","IfcInternalOrExternalEnum"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** RelatingSpace is an DEMANDED attribute - may not be null**/
	protected IfcSpace RelatingSpace;
	/** RelatedBuildingElement is an OPTIONAL attribute**/
	protected IfcElement RelatedBuildingElement;
	/** ConnectionGeometry is an OPTIONAL attribute**/
	protected IfcConnectionGeometry ConnectionGeometry;
	/** PhysicalOrVirtualBoundary is an DEMANDED attribute - may not be null**/
	protected IfcPhysicalOrVirtualEnum PhysicalOrVirtualBoundary;
	/** InternalOrExternalBoundary is an DEMANDED attribute - may not be null**/
	protected IfcInternalOrExternalEnum InternalOrExternalBoundary;
	/**
	* The default constructor.
	**/
	public IfcRelSpaceBoundary(){}

	private static final String[] attributes = new String[]{"GlobalId","OwnerHistory","Name","Description"
			,"RelatingSpace","RelatedBuildingElement","ConnectionGeometry","PhysicalOrVirtualBoundary","InternalOrExternalBoundary"};

	public String[] getAttributes() {
		return IfcRelSpaceBoundary.attributes;
	}

	/**
	* Constructs a new IfcRelSpaceBoundary object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param RelatingSpace DEMANDED parameter of type IfcSpace - may not be null.
	* @param RelatedBuildingElement OPTIONAL parameter of type IfcElement
	* @param ConnectionGeometry OPTIONAL parameter of type IfcConnectionGeometry
	* @param PhysicalOrVirtualBoundary DEMANDED parameter of type IfcPhysicalOrVirtualEnum - may not be null.
	* @param InternalOrExternalBoundary DEMANDED parameter of type IfcInternalOrExternalEnum - may not be null.
	**/
	public IfcRelSpaceBoundary(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcSpace RelatingSpace, IfcElement RelatedBuildingElement, IfcConnectionGeometry ConnectionGeometry, IfcPhysicalOrVirtualEnum PhysicalOrVirtualBoundary, IfcInternalOrExternalEnum InternalOrExternalBoundary)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.RelatingSpace = RelatingSpace;
		this.RelatedBuildingElement = RelatedBuildingElement;
		this.ConnectionGeometry = ConnectionGeometry;
		this.PhysicalOrVirtualBoundary = PhysicalOrVirtualBoundary;
		this.InternalOrExternalBoundary = InternalOrExternalBoundary;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcRelSpaceBoundary object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param RelatingSpace DEMANDED parameter of type IfcSpace - may not be null.
	* @param RelatedBuildingElement OPTIONAL parameter of type IfcElement
	* @param ConnectionGeometry OPTIONAL parameter of type IfcConnectionGeometry
	* @param PhysicalOrVirtualBoundary DEMANDED parameter of type IfcPhysicalOrVirtualEnum - may not be null.
	* @param InternalOrExternalBoundary DEMANDED parameter of type IfcInternalOrExternalEnum - may not be null.
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcSpace RelatingSpace, IfcElement RelatedBuildingElement, IfcConnectionGeometry ConnectionGeometry, IfcPhysicalOrVirtualEnum PhysicalOrVirtualBoundary, IfcInternalOrExternalEnum InternalOrExternalBoundary)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.RelatingSpace = RelatingSpace;
		this.RelatedBuildingElement = RelatedBuildingElement;
		this.ConnectionGeometry = ConnectionGeometry;
		this.PhysicalOrVirtualBoundary = PhysicalOrVirtualBoundary;
		this.InternalOrExternalBoundary = InternalOrExternalBoundary;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.GlobalId = (IfcGloballyUniqueId) parameters.get(0);
		this.OwnerHistory = (IfcOwnerHistory) parameters.get(1);
		this.Name = (IfcLabel) parameters.get(2);
		this.Description = (IfcText) parameters.get(3);
		this.RelatingSpace = (IfcSpace) parameters.get(4);
		this.RelatedBuildingElement = (IfcElement) parameters.get(5);
		this.ConnectionGeometry = (IfcConnectionGeometry) parameters.get(6);
		this.PhysicalOrVirtualBoundary = (IfcPhysicalOrVirtualEnum) parameters.get(7);
		this.InternalOrExternalBoundary = (IfcInternalOrExternalEnum) parameters.get(8);
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
		if(RelatingSpace != null)
		{
				if(RelatingSpace.BoundedBy_Inverse == null)
				{
					RelatingSpace.BoundedBy_Inverse = new SET<IfcRelSpaceBoundary>();
				}
				RelatingSpace.BoundedBy_Inverse.add(this);
		}
		if(RelatedBuildingElement != null)
		{
				if(RelatedBuildingElement.ProvidesBoundaries_Inverse == null)
				{
					RelatedBuildingElement.ProvidesBoundaries_Inverse = new SET<IfcRelSpaceBoundary>();
				}
				RelatedBuildingElement.ProvidesBoundaries_Inverse.add(this);
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcRelSpaceBoundary.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCRELSPACEBOUNDARY(");
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
		if(getRedefinedDerivedAttributeTypes().contains("RelatingSpace")) stepString = stepString.concat("*,");
		else{
		if(this.RelatingSpace != null)		stepString = stepString.concat(((RootInterface)this.RelatingSpace).getStepParameter(IfcSpace.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RelatedBuildingElement")) stepString = stepString.concat("*,");
		else{
		if(this.RelatedBuildingElement != null)		stepString = stepString.concat(((RootInterface)this.RelatedBuildingElement).getStepParameter(IfcElement.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ConnectionGeometry")) stepString = stepString.concat("*,");
		else{
		if(this.ConnectionGeometry != null)		stepString = stepString.concat(((RootInterface)this.ConnectionGeometry).getStepParameter(IfcConnectionGeometry.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("PhysicalOrVirtualBoundary")) stepString = stepString.concat("*,");
		else{
		if(this.PhysicalOrVirtualBoundary != null)		stepString = stepString.concat(((RootInterface)this.PhysicalOrVirtualBoundary).getStepParameter(IfcPhysicalOrVirtualEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("InternalOrExternalBoundary")) stepString = stepString.concat("*);");
		else{
		if(this.InternalOrExternalBoundary != null)		stepString = stepString.concat(((RootInterface)this.InternalOrExternalBoundary).getStepParameter(IfcInternalOrExternalEnum.class.isInterface())+");");
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
	* This method sets the RelatingSpace attribute to the given value.
	*
	* @param RelatingSpace OPTIONAL value to set
	**/
	public void setRelatingSpace(IfcSpace RelatingSpace)
	{
		synchronizeInversesRemoveRelatingSpace(this.RelatingSpace);
		this.RelatingSpace = RelatingSpace;
		synchronizeInversesAddRelatingSpace(this.RelatingSpace);
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RelatingSpace attribute.
	*
	* @return the value of RelatingSpace
	/**/
	public IfcSpace getRelatingSpace()
	{
		return this.RelatingSpace;
	}

	private void synchronizeInversesAddRelatingSpace(IfcSpace RelatingSpace)
	{
		if(RelatingSpace != null)
		{
				if(RelatingSpace.BoundedBy_Inverse == null)
				{
					RelatingSpace.BoundedBy_Inverse = new SET<IfcRelSpaceBoundary>();
				}
				RelatingSpace.BoundedBy_Inverse.add(this);
		}
	}

	private void synchronizeInversesRemoveRelatingSpace(IfcSpace RelatingSpace)
	{
		if(RelatingSpace != null)
		{
				if(RelatingSpace.BoundedBy_Inverse != null)
				{
					RelatingSpace.BoundedBy_Inverse.remove(this);
				}
		}
	}

	/**
	* This method sets the RelatedBuildingElement attribute to the given value.
	*
	* @param RelatedBuildingElement DEMANDED value to set - may not be null
	**/
	public void setRelatedBuildingElement(IfcElement RelatedBuildingElement)
	{
		synchronizeInversesRemoveRelatedBuildingElement(this.RelatedBuildingElement);
		this.RelatedBuildingElement = RelatedBuildingElement;
		synchronizeInversesAddRelatedBuildingElement(this.RelatedBuildingElement);
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RelatedBuildingElement attribute.
	*
	* @return the value of RelatedBuildingElement
	/**/
	public IfcElement getRelatedBuildingElement()
	{
		return this.RelatedBuildingElement;
	}

	private void synchronizeInversesAddRelatedBuildingElement(IfcElement RelatedBuildingElement)
	{
		if(RelatedBuildingElement != null)
		{
				if(RelatedBuildingElement.ProvidesBoundaries_Inverse == null)
				{
					RelatedBuildingElement.ProvidesBoundaries_Inverse = new SET<IfcRelSpaceBoundary>();
				}
				RelatedBuildingElement.ProvidesBoundaries_Inverse.add(this);
		}
	}

	private void synchronizeInversesRemoveRelatedBuildingElement(IfcElement RelatedBuildingElement)
	{
		if(RelatedBuildingElement != null)
		{
				if(RelatedBuildingElement.ProvidesBoundaries_Inverse != null)
				{
					RelatedBuildingElement.ProvidesBoundaries_Inverse.remove(this);
				}
		}
	}

	/**
	* This method sets the ConnectionGeometry attribute to the given value.
	*
	* @param ConnectionGeometry DEMANDED value to set - may not be null
	**/
	public void setConnectionGeometry(IfcConnectionGeometry ConnectionGeometry)
	{
		this.ConnectionGeometry = ConnectionGeometry;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ConnectionGeometry attribute.
	*
	* @return the value of ConnectionGeometry
	/**/
	public IfcConnectionGeometry getConnectionGeometry()
	{
		return this.ConnectionGeometry;
	}

	/**
	* This method sets the PhysicalOrVirtualBoundary attribute to the given value.
	*
	* @param PhysicalOrVirtualBoundary OPTIONAL value to set
	**/
	public void setPhysicalOrVirtualBoundary(IfcPhysicalOrVirtualEnum PhysicalOrVirtualBoundary)
	{
		this.PhysicalOrVirtualBoundary = PhysicalOrVirtualBoundary;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the PhysicalOrVirtualBoundary attribute.
	*
	* @return the value of PhysicalOrVirtualBoundary
	/**/
	public IfcPhysicalOrVirtualEnum getPhysicalOrVirtualBoundary()
	{
		return this.PhysicalOrVirtualBoundary;
	}

	/**
	* This method sets the InternalOrExternalBoundary attribute to the given value.
	*
	* @param InternalOrExternalBoundary OPTIONAL value to set
	**/
	public void setInternalOrExternalBoundary(IfcInternalOrExternalEnum InternalOrExternalBoundary)
	{
		this.InternalOrExternalBoundary = InternalOrExternalBoundary;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the InternalOrExternalBoundary attribute.
	*
	* @return the value of InternalOrExternalBoundary
	/**/
	public IfcInternalOrExternalEnum getInternalOrExternalBoundary()
	{
		return this.InternalOrExternalBoundary;
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
		IfcRelSpaceBoundary ifcRelSpaceBoundary = new IfcRelSpaceBoundary();
		if(this.GlobalId != null)
			ifcRelSpaceBoundary.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcRelSpaceBoundary.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcRelSpaceBoundary.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcRelSpaceBoundary.setDescription((IfcText)this.Description.clone());
		if(this.RelatingSpace != null)
			ifcRelSpaceBoundary.setRelatingSpace((IfcSpace)this.RelatingSpace.clone());
		if(this.RelatedBuildingElement != null)
			ifcRelSpaceBoundary.setRelatedBuildingElement((IfcElement)this.RelatedBuildingElement.clone());
		if(this.ConnectionGeometry != null)
			ifcRelSpaceBoundary.setConnectionGeometry((IfcConnectionGeometry)this.ConnectionGeometry.clone());
		if(this.PhysicalOrVirtualBoundary != null)
			ifcRelSpaceBoundary.setPhysicalOrVirtualBoundary((IfcPhysicalOrVirtualEnum)this.PhysicalOrVirtualBoundary.clone());
		if(this.InternalOrExternalBoundary != null)
			ifcRelSpaceBoundary.setInternalOrExternalBoundary((IfcInternalOrExternalEnum)this.InternalOrExternalBoundary.clone());
		return ifcRelSpaceBoundary;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcRelSpaceBoundary ifcRelSpaceBoundary = new IfcRelSpaceBoundary();
		if(this.GlobalId != null)
			ifcRelSpaceBoundary.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcRelSpaceBoundary.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcRelSpaceBoundary.setName(this.Name);
		if(this.Description != null)
			ifcRelSpaceBoundary.setDescription(this.Description);
		if(this.RelatingSpace != null)
			ifcRelSpaceBoundary.setRelatingSpace(this.RelatingSpace);
		if(this.RelatedBuildingElement != null)
			ifcRelSpaceBoundary.setRelatedBuildingElement(this.RelatedBuildingElement);
		if(this.ConnectionGeometry != null)
			ifcRelSpaceBoundary.setConnectionGeometry(this.ConnectionGeometry);
		if(this.PhysicalOrVirtualBoundary != null)
			ifcRelSpaceBoundary.setPhysicalOrVirtualBoundary(this.PhysicalOrVirtualBoundary);
		if(this.InternalOrExternalBoundary != null)
			ifcRelSpaceBoundary.setInternalOrExternalBoundary(this.InternalOrExternalBoundary);
		return ifcRelSpaceBoundary;
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