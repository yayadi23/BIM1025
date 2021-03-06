/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc2x3javatoolbox.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcOrganization<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcOrganization extends InternalAccessClass implements IfcActorSelect, IfcObjectReferenceSelect, ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcIdentifier","IfcLabel","IfcText","LIST<IfcActorRole>","LIST<IfcAddress>"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Id is an OPTIONAL attribute**/
	protected IfcIdentifier Id;
	/** Name is an DEMANDED attribute - may not be null**/
	protected IfcLabel Name;
	/** Description is an OPTIONAL attribute**/
	protected IfcText Description;
	/** Roles is an OPTIONAL attribute**/
	protected LIST<IfcActorRole> Roles;
	/** Addresses is an OPTIONAL attribute**/
	protected LIST<IfcAddress> Addresses;
	protected SET<IfcOrganizationRelationship> IsRelatedBy_Inverse;
	protected SET<IfcOrganizationRelationship> Relates_Inverse;
	protected SET<IfcPersonAndOrganization> Engages_Inverse;
	/**
	* The default constructor.
	**/
	public IfcOrganization(){}

	private static final String[] attributes = new String[]{"Id","Name","Description","Roles"
			,"Addresses"};

	public String[] getAttributes() {
		return IfcOrganization.attributes;
	}

	/**
	* Constructs a new IfcOrganization object using the given parameters.
	*
	* @param Id OPTIONAL parameter of type IfcIdentifier
	* @param Name DEMANDED parameter of type IfcLabel - may not be null.
	* @param Description OPTIONAL parameter of type IfcText
	* @param Roles OPTIONAL parameter of type LIST<IfcActorRole>
	* @param Addresses OPTIONAL parameter of type LIST<IfcAddress>
	**/
	public IfcOrganization(IfcIdentifier Id, IfcLabel Name, IfcText Description, LIST<IfcActorRole> Roles, LIST<IfcAddress> Addresses)
	{
		this.Id = Id;
		this.Name = Name;
		this.Description = Description;
		this.Roles = Roles;
		this.Addresses = Addresses;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcOrganization object using the given parameters.
	*
	* @param Id OPTIONAL parameter of type IfcIdentifier
	* @param Name DEMANDED parameter of type IfcLabel - may not be null.
	* @param Description OPTIONAL parameter of type IfcText
	* @param Roles OPTIONAL parameter of type LIST<IfcActorRole>
	* @param Addresses OPTIONAL parameter of type LIST<IfcAddress>
	**/
	public void setParameters(IfcIdentifier Id, IfcLabel Name, IfcText Description, LIST<IfcActorRole> Roles, LIST<IfcAddress> Addresses)
	{
		this.Id = Id;
		this.Name = Name;
		this.Description = Description;
		this.Roles = Roles;
		this.Addresses = Addresses;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Id = (IfcIdentifier) parameters.get(0);
		this.Name = (IfcLabel) parameters.get(1);
		this.Description = (IfcText) parameters.get(2);
		this.Roles = (LIST<IfcActorRole>) parameters.get(3);
		this.Addresses = (LIST<IfcAddress>) parameters.get(4);
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void destruct()
	{
		listenerList = null;
		IsRelatedBy_Inverse = null;
		Relates_Inverse = null;
		Engages_Inverse = null;
	}

	private void resolveInverses()
	{
		if(Addresses != null)
		{
			for(IfcAddress Addresses$ : Addresses)
			{
				if(Addresses$.OfOrganization_Inverse == null)
				{
					Addresses$.OfOrganization_Inverse = new SET<IfcOrganization>();
				}
				Addresses$.OfOrganization_Inverse.add(this);
			}
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcOrganization.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCORGANIZATION(");
		if(getRedefinedDerivedAttributeTypes().contains("Id")) stepString = stepString.concat("*,");
		else{
		if(this.Id != null)		stepString = stepString.concat(((RootInterface)this.Id).getStepParameter(IfcIdentifier.class.isInterface())+",");
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
		if(getRedefinedDerivedAttributeTypes().contains("Roles")) stepString = stepString.concat("*,");
		else{
		if(this.Roles != null)		stepString = stepString.concat(((RootInterface)this.Roles).getStepParameter(IfcActorRole.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Addresses")) stepString = stepString.concat("*);");
		else{
		if(this.Addresses != null)		stepString = stepString.concat(((RootInterface)this.Addresses).getStepParameter(IfcAddress.class.isInterface())+");");
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
	* This method returns a copy of the set of the IsRelatedBy_Inverse attribute.
	*
	* @return a copy of the IsRelatedBy_Inverse set
	**/
	public SET<IfcOrganizationRelationship> getIsRelatedBy_Inverse()
	{
		if(this.IsRelatedBy_Inverse != null)
			return new SET<IfcOrganizationRelationship>(this.IsRelatedBy_Inverse);
		return null;
	}

	/**
	* This method returns a copy of the set of the Relates_Inverse attribute.
	*
	* @return a copy of the Relates_Inverse set
	**/
	public SET<IfcOrganizationRelationship> getRelates_Inverse()
	{
		if(this.Relates_Inverse != null)
			return new SET<IfcOrganizationRelationship>(this.Relates_Inverse);
		return null;
	}

	/**
	* This method returns a copy of the set of the Engages_Inverse attribute.
	*
	* @return a copy of the Engages_Inverse set
	**/
	public SET<IfcPersonAndOrganization> getEngages_Inverse()
	{
		if(this.Engages_Inverse != null)
			return new SET<IfcPersonAndOrganization>(this.Engages_Inverse);
		return null;
	}

	/**
	* This method sets the Id attribute to the given value.
	*
	* @param Id DEMANDED value to set - may not be null
	**/
	public void setId(IfcIdentifier Id)
	{
		this.Id = Id;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Id attribute.
	*
	* @return the value of Id
	/**/
	public IfcIdentifier getId()
	{
		return this.Id;
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
	* This method sets the Roles attribute to the given value.
	*
	* @param Roles DEMANDED value to set - may not be null
	**/
	public void setRoles(LIST<IfcActorRole> Roles)
	{
		this.Roles = Roles;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the Roles attribute.
	*
	* @return a copy of the Roles list
	**/
	public LIST<IfcActorRole> getRoles()
	{
		if(this.Roles != null)
			return new LIST<IfcActorRole>(this.Roles);
		return null;
	}

	/**
	* This method adds an IfcActorRole object to the Roles list.
	* @param Roles element to be appended to this list.
	**/
	public void addRoles(IfcActorRole Roles)
	{
		if(this.Roles == null)
			this.Roles = new LIST<IfcActorRole>();
		this.Roles.add(Roles);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcActorRole objects to the Roles list.
	* @param Roles collection containing elements to be added to this list.
	**/
	public void addAllRoles(java.util.Collection<IfcActorRole> Roles)
	{
		if(this.Roles == null)
			this.Roles = new LIST<IfcActorRole>();
		this.Roles.addAll(Roles);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the Roles list.
	**/
	public void clearRoles()
	{
		if(this.Roles != null)
		{
			this.Roles.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcActorRole object from the Roles list.
	* @param Roles element to be removed from this list.
	**/
	public void removeRoles(IfcActorRole Roles)
	{
		if(this.Roles != null)
		{
			this.Roles.remove(Roles);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcActorRole objects from the Roles list.
	* @param Roles collection containing elements to be removed from this list.
	**/
	public void removeAllRoles(java.util.Collection<IfcActorRole> Roles)
	{
		if(this.Roles != null)
		{
			this.Roles.removeAll(Roles);
			fireChangeEvent();
		}
	}

	/**
	* This method sets the Addresses attribute to the given value.
	*
	* @param Addresses DEMANDED value to set - may not be null
	**/
	public void setAddresses(LIST<IfcAddress> Addresses)
	{
		synchronizeInversesRemoveAddresses(this.Addresses);
		this.Addresses = Addresses;
		synchronizeInversesAddAddresses(this.Addresses);
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the Addresses attribute.
	*
	* @return a copy of the Addresses list
	**/
	public LIST<IfcAddress> getAddresses()
	{
		if(this.Addresses != null)
			return new LIST<IfcAddress>(this.Addresses);
		return null;
	}

	/**
	* This method adds an IfcAddress object to the Addresses list.
	* @param Addresses element to be appended to this list.
	**/
	public void addAddresses(IfcAddress Addresses)
	{
		if(this.Addresses == null)
			this.Addresses = new LIST<IfcAddress>();
		this.Addresses.add(Addresses);
		synchronizeInversesAddAddresses(Addresses);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcAddress objects to the Addresses list.
	* @param Addresses collection containing elements to be added to this list.
	**/
	public void addAllAddresses(java.util.Collection<IfcAddress> Addresses)
	{
		if(this.Addresses == null)
			this.Addresses = new LIST<IfcAddress>();
		this.Addresses.addAll(Addresses);
		synchronizeInversesAddAddresses(Addresses);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the Addresses list.
	**/
	public void clearAddresses()
	{
		if(this.Addresses != null)
		{
			synchronizeInversesRemoveAddresses(this.Addresses);
			this.Addresses.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcAddress object from the Addresses list.
	* @param Addresses element to be removed from this list.
	**/
	public void removeAddresses(IfcAddress Addresses)
	{
		if(this.Addresses != null)
		{
			this.Addresses.remove(Addresses);
			synchronizeInversesRemoveAddresses(Addresses);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcAddress objects from the Addresses list.
	* @param Addresses collection containing elements to be removed from this list.
	**/
	public void removeAllAddresses(java.util.Collection<IfcAddress> Addresses)
	{
		if(this.Addresses != null)
		{
			this.Addresses.removeAll(Addresses);
			synchronizeInversesRemoveAddresses(Addresses);
			fireChangeEvent();
		}
	}

	private void synchronizeInversesAddAddresses(IfcAddress Addresses)
	{
		if(Addresses != null)
		{
				if(Addresses.OfOrganization_Inverse == null)
				{
					Addresses.OfOrganization_Inverse = new SET<IfcOrganization>();
				}
				Addresses.OfOrganization_Inverse.add(this);
		}
	}

	private void synchronizeInversesAddAddresses(java.util.Collection<IfcAddress> Addresses)
	{
		if(Addresses != null)
		{
			for(IfcAddress Addresses$ : Addresses)
			{
				synchronizeInversesAddAddresses(Addresses$);
			}
		}
	}

	private void synchronizeInversesRemoveAddresses(IfcAddress Addresses)
	{
		if(Addresses != null)
		{
				if(Addresses.OfOrganization_Inverse != null)
				{
					Addresses.OfOrganization_Inverse.remove(this);
				}
		}
	}

	private void synchronizeInversesRemoveAddresses(java.util.Collection<IfcAddress> Addresses)
	{
		if(Addresses != null)
		{
			for(IfcAddress Addresses$ : Addresses)
			{
				synchronizeInversesRemoveAddresses(Addresses$);
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
		IfcOrganization ifcOrganization = new IfcOrganization();
		if(this.Id != null)
			ifcOrganization.setId((IfcIdentifier)this.Id.clone());
		if(this.Name != null)
			ifcOrganization.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcOrganization.setDescription((IfcText)this.Description.clone());
		if(this.Roles != null)
			ifcOrganization.setRoles((LIST<IfcActorRole>)this.Roles.clone());
		if(this.Addresses != null)
			ifcOrganization.setAddresses((LIST<IfcAddress>)this.Addresses.clone());
		return ifcOrganization;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcOrganization ifcOrganization = new IfcOrganization();
		if(this.Id != null)
			ifcOrganization.setId(this.Id);
		if(this.Name != null)
			ifcOrganization.setName(this.Name);
		if(this.Description != null)
			ifcOrganization.setDescription(this.Description);
		if(this.Roles != null)
			ifcOrganization.setRoles(this.Roles);
		if(this.Addresses != null)
			ifcOrganization.setAddresses(this.Addresses);
		return ifcOrganization;
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
