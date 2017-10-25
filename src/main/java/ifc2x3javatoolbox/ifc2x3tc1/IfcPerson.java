/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc2x3javatoolbox.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcPerson<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcPerson extends InternalAccessClass implements IfcActorSelect, IfcObjectReferenceSelect, ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcIdentifier","IfcLabel","IfcLabel","LIST<IfcLabel>","LIST<IfcLabel>","LIST<IfcLabel>","LIST<IfcActorRole>","LIST<IfcAddress>"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Id is an OPTIONAL attribute**/
	protected IfcIdentifier Id;
	/** FamilyName is an OPTIONAL attribute**/
	protected IfcLabel FamilyName;
	/** GivenName is an OPTIONAL attribute**/
	protected IfcLabel GivenName;
	/** MiddleNames is an OPTIONAL attribute**/
	protected LIST<IfcLabel> MiddleNames;
	/** PrefixTitles is an OPTIONAL attribute**/
	protected LIST<IfcLabel> PrefixTitles;
	/** SuffixTitles is an OPTIONAL attribute**/
	protected LIST<IfcLabel> SuffixTitles;
	/** Roles is an OPTIONAL attribute**/
	protected LIST<IfcActorRole> Roles;
	/** Addresses is an OPTIONAL attribute**/
	protected LIST<IfcAddress> Addresses;
	protected SET<IfcPersonAndOrganization> EngagedIn_Inverse;
	/**
	* The default constructor.
	**/
	public IfcPerson(){}

	private static final String[] attributes = new String[]{"Id","FamilyName","GivenName","MiddleNames"
			,"PrefixTitles","SuffixTitles","Roles","Addresses"};

	public String[] getAttributes() {
		return IfcPerson.attributes;
	}

	/**
	* Constructs a new IfcPerson object using the given parameters.
	*
	* @param Id OPTIONAL parameter of type IfcIdentifier
	* @param FamilyName OPTIONAL parameter of type IfcLabel
	* @param GivenName OPTIONAL parameter of type IfcLabel
	* @param MiddleNames OPTIONAL parameter of type LIST<IfcLabel>
	* @param PrefixTitles OPTIONAL parameter of type LIST<IfcLabel>
	* @param SuffixTitles OPTIONAL parameter of type LIST<IfcLabel>
	* @param Roles OPTIONAL parameter of type LIST<IfcActorRole>
	* @param Addresses OPTIONAL parameter of type LIST<IfcAddress>
	**/
	public IfcPerson(IfcIdentifier Id, IfcLabel FamilyName, IfcLabel GivenName, LIST<IfcLabel> MiddleNames, LIST<IfcLabel> PrefixTitles, LIST<IfcLabel> SuffixTitles, LIST<IfcActorRole> Roles, LIST<IfcAddress> Addresses)
	{
		this.Id = Id;
		this.FamilyName = FamilyName;
		this.GivenName = GivenName;
		this.MiddleNames = MiddleNames;
		this.PrefixTitles = PrefixTitles;
		this.SuffixTitles = SuffixTitles;
		this.Roles = Roles;
		this.Addresses = Addresses;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcPerson object using the given parameters.
	*
	* @param Id OPTIONAL parameter of type IfcIdentifier
	* @param FamilyName OPTIONAL parameter of type IfcLabel
	* @param GivenName OPTIONAL parameter of type IfcLabel
	* @param MiddleNames OPTIONAL parameter of type LIST<IfcLabel>
	* @param PrefixTitles OPTIONAL parameter of type LIST<IfcLabel>
	* @param SuffixTitles OPTIONAL parameter of type LIST<IfcLabel>
	* @param Roles OPTIONAL parameter of type LIST<IfcActorRole>
	* @param Addresses OPTIONAL parameter of type LIST<IfcAddress>
	**/
	public void setParameters(IfcIdentifier Id, IfcLabel FamilyName, IfcLabel GivenName, LIST<IfcLabel> MiddleNames, LIST<IfcLabel> PrefixTitles, LIST<IfcLabel> SuffixTitles, LIST<IfcActorRole> Roles, LIST<IfcAddress> Addresses)
	{
		this.Id = Id;
		this.FamilyName = FamilyName;
		this.GivenName = GivenName;
		this.MiddleNames = MiddleNames;
		this.PrefixTitles = PrefixTitles;
		this.SuffixTitles = SuffixTitles;
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
		this.FamilyName = (IfcLabel) parameters.get(1);
		this.GivenName = (IfcLabel) parameters.get(2);
		this.MiddleNames = (LIST<IfcLabel>) parameters.get(3);
		this.PrefixTitles = (LIST<IfcLabel>) parameters.get(4);
		this.SuffixTitles = (LIST<IfcLabel>) parameters.get(5);
		this.Roles = (LIST<IfcActorRole>) parameters.get(6);
		this.Addresses = (LIST<IfcAddress>) parameters.get(7);
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void destruct()
	{
		listenerList = null;
		EngagedIn_Inverse = null;
	}

	private void resolveInverses()
	{
		if(Addresses != null)
		{
			for(IfcAddress Addresses$ : Addresses)
			{
				if(Addresses$.OfPerson_Inverse == null)
				{
					Addresses$.OfPerson_Inverse = new SET<IfcPerson>();
				}
				Addresses$.OfPerson_Inverse.add(this);
			}
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcPerson.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCPERSON(");
		if(getRedefinedDerivedAttributeTypes().contains("Id")) stepString = stepString.concat("*,");
		else{
		if(this.Id != null)		stepString = stepString.concat(((RootInterface)this.Id).getStepParameter(IfcIdentifier.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("FamilyName")) stepString = stepString.concat("*,");
		else{
		if(this.FamilyName != null)		stepString = stepString.concat(((RootInterface)this.FamilyName).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("GivenName")) stepString = stepString.concat("*,");
		else{
		if(this.GivenName != null)		stepString = stepString.concat(((RootInterface)this.GivenName).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("MiddleNames")) stepString = stepString.concat("*,");
		else{
		if(this.MiddleNames != null)		stepString = stepString.concat(((RootInterface)this.MiddleNames).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("PrefixTitles")) stepString = stepString.concat("*,");
		else{
		if(this.PrefixTitles != null)		stepString = stepString.concat(((RootInterface)this.PrefixTitles).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("SuffixTitles")) stepString = stepString.concat("*,");
		else{
		if(this.SuffixTitles != null)		stepString = stepString.concat(((RootInterface)this.SuffixTitles).getStepParameter(IfcLabel.class.isInterface())+",");
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
	* This method returns a copy of the set of the EngagedIn_Inverse attribute.
	*
	* @return a copy of the EngagedIn_Inverse set
	**/
	public SET<IfcPersonAndOrganization> getEngagedIn_Inverse()
	{
		if(this.EngagedIn_Inverse != null)
			return new SET<IfcPersonAndOrganization>(this.EngagedIn_Inverse);
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
	* This method sets the FamilyName attribute to the given value.
	*
	* @param FamilyName DEMANDED value to set - may not be null
	**/
	public void setFamilyName(IfcLabel FamilyName)
	{
		this.FamilyName = FamilyName;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the FamilyName attribute.
	*
	* @return the value of FamilyName
	/**/
	public IfcLabel getFamilyName()
	{
		return this.FamilyName;
	}

	/**
	* This method sets the GivenName attribute to the given value.
	*
	* @param GivenName DEMANDED value to set - may not be null
	**/
	public void setGivenName(IfcLabel GivenName)
	{
		this.GivenName = GivenName;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the GivenName attribute.
	*
	* @return the value of GivenName
	/**/
	public IfcLabel getGivenName()
	{
		return this.GivenName;
	}

	/**
	* This method sets the MiddleNames attribute to the given value.
	*
	* @param MiddleNames DEMANDED value to set - may not be null
	**/
	public void setMiddleNames(LIST<IfcLabel> MiddleNames)
	{
		this.MiddleNames = MiddleNames;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the MiddleNames attribute.
	*
	* @return a copy of the MiddleNames list
	**/
	public LIST<IfcLabel> getMiddleNames()
	{
		if(this.MiddleNames != null)
			return new LIST<IfcLabel>(this.MiddleNames);
		return null;
	}

	/**
	* This method adds an IfcLabel object to the MiddleNames list.
	* @param MiddleNames element to be appended to this list.
	**/
	public void addMiddleNames(IfcLabel MiddleNames)
	{
		if(this.MiddleNames == null)
			this.MiddleNames = new LIST<IfcLabel>();
		this.MiddleNames.add(MiddleNames);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcLabel objects to the MiddleNames list.
	* @param MiddleNames collection containing elements to be added to this list.
	**/
	public void addAllMiddleNames(java.util.Collection<IfcLabel> MiddleNames)
	{
		if(this.MiddleNames == null)
			this.MiddleNames = new LIST<IfcLabel>();
		this.MiddleNames.addAll(MiddleNames);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the MiddleNames list.
	**/
	public void clearMiddleNames()
	{
		if(this.MiddleNames != null)
		{
			this.MiddleNames.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcLabel object from the MiddleNames list.
	* @param MiddleNames element to be removed from this list.
	**/
	public void removeMiddleNames(IfcLabel MiddleNames)
	{
		if(this.MiddleNames != null)
		{
			this.MiddleNames.remove(MiddleNames);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcLabel objects from the MiddleNames list.
	* @param MiddleNames collection containing elements to be removed from this list.
	**/
	public void removeAllMiddleNames(java.util.Collection<IfcLabel> MiddleNames)
	{
		if(this.MiddleNames != null)
		{
			this.MiddleNames.removeAll(MiddleNames);
			fireChangeEvent();
		}
	}

	/**
	* This method sets the PrefixTitles attribute to the given value.
	*
	* @param PrefixTitles DEMANDED value to set - may not be null
	**/
	public void setPrefixTitles(LIST<IfcLabel> PrefixTitles)
	{
		this.PrefixTitles = PrefixTitles;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the PrefixTitles attribute.
	*
	* @return a copy of the PrefixTitles list
	**/
	public LIST<IfcLabel> getPrefixTitles()
	{
		if(this.PrefixTitles != null)
			return new LIST<IfcLabel>(this.PrefixTitles);
		return null;
	}

	/**
	* This method adds an IfcLabel object to the PrefixTitles list.
	* @param PrefixTitles element to be appended to this list.
	**/
	public void addPrefixTitles(IfcLabel PrefixTitles)
	{
		if(this.PrefixTitles == null)
			this.PrefixTitles = new LIST<IfcLabel>();
		this.PrefixTitles.add(PrefixTitles);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcLabel objects to the PrefixTitles list.
	* @param PrefixTitles collection containing elements to be added to this list.
	**/
	public void addAllPrefixTitles(java.util.Collection<IfcLabel> PrefixTitles)
	{
		if(this.PrefixTitles == null)
			this.PrefixTitles = new LIST<IfcLabel>();
		this.PrefixTitles.addAll(PrefixTitles);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the PrefixTitles list.
	**/
	public void clearPrefixTitles()
	{
		if(this.PrefixTitles != null)
		{
			this.PrefixTitles.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcLabel object from the PrefixTitles list.
	* @param PrefixTitles element to be removed from this list.
	**/
	public void removePrefixTitles(IfcLabel PrefixTitles)
	{
		if(this.PrefixTitles != null)
		{
			this.PrefixTitles.remove(PrefixTitles);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcLabel objects from the PrefixTitles list.
	* @param PrefixTitles collection containing elements to be removed from this list.
	**/
	public void removeAllPrefixTitles(java.util.Collection<IfcLabel> PrefixTitles)
	{
		if(this.PrefixTitles != null)
		{
			this.PrefixTitles.removeAll(PrefixTitles);
			fireChangeEvent();
		}
	}

	/**
	* This method sets the SuffixTitles attribute to the given value.
	*
	* @param SuffixTitles DEMANDED value to set - may not be null
	**/
	public void setSuffixTitles(LIST<IfcLabel> SuffixTitles)
	{
		this.SuffixTitles = SuffixTitles;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the SuffixTitles attribute.
	*
	* @return a copy of the SuffixTitles list
	**/
	public LIST<IfcLabel> getSuffixTitles()
	{
		if(this.SuffixTitles != null)
			return new LIST<IfcLabel>(this.SuffixTitles);
		return null;
	}

	/**
	* This method adds an IfcLabel object to the SuffixTitles list.
	* @param SuffixTitles element to be appended to this list.
	**/
	public void addSuffixTitles(IfcLabel SuffixTitles)
	{
		if(this.SuffixTitles == null)
			this.SuffixTitles = new LIST<IfcLabel>();
		this.SuffixTitles.add(SuffixTitles);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcLabel objects to the SuffixTitles list.
	* @param SuffixTitles collection containing elements to be added to this list.
	**/
	public void addAllSuffixTitles(java.util.Collection<IfcLabel> SuffixTitles)
	{
		if(this.SuffixTitles == null)
			this.SuffixTitles = new LIST<IfcLabel>();
		this.SuffixTitles.addAll(SuffixTitles);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the SuffixTitles list.
	**/
	public void clearSuffixTitles()
	{
		if(this.SuffixTitles != null)
		{
			this.SuffixTitles.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcLabel object from the SuffixTitles list.
	* @param SuffixTitles element to be removed from this list.
	**/
	public void removeSuffixTitles(IfcLabel SuffixTitles)
	{
		if(this.SuffixTitles != null)
		{
			this.SuffixTitles.remove(SuffixTitles);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcLabel objects from the SuffixTitles list.
	* @param SuffixTitles collection containing elements to be removed from this list.
	**/
	public void removeAllSuffixTitles(java.util.Collection<IfcLabel> SuffixTitles)
	{
		if(this.SuffixTitles != null)
		{
			this.SuffixTitles.removeAll(SuffixTitles);
			fireChangeEvent();
		}
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
				if(Addresses.OfPerson_Inverse == null)
				{
					Addresses.OfPerson_Inverse = new SET<IfcPerson>();
				}
				Addresses.OfPerson_Inverse.add(this);
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
				if(Addresses.OfPerson_Inverse != null)
				{
					Addresses.OfPerson_Inverse.remove(this);
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
		IfcPerson ifcPerson = new IfcPerson();
		if(this.Id != null)
			ifcPerson.setId((IfcIdentifier)this.Id.clone());
		if(this.FamilyName != null)
			ifcPerson.setFamilyName((IfcLabel)this.FamilyName.clone());
		if(this.GivenName != null)
			ifcPerson.setGivenName((IfcLabel)this.GivenName.clone());
		if(this.MiddleNames != null)
			ifcPerson.setMiddleNames((LIST<IfcLabel>)this.MiddleNames.clone());
		if(this.PrefixTitles != null)
			ifcPerson.setPrefixTitles((LIST<IfcLabel>)this.PrefixTitles.clone());
		if(this.SuffixTitles != null)
			ifcPerson.setSuffixTitles((LIST<IfcLabel>)this.SuffixTitles.clone());
		if(this.Roles != null)
			ifcPerson.setRoles((LIST<IfcActorRole>)this.Roles.clone());
		if(this.Addresses != null)
			ifcPerson.setAddresses((LIST<IfcAddress>)this.Addresses.clone());
		return ifcPerson;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcPerson ifcPerson = new IfcPerson();
		if(this.Id != null)
			ifcPerson.setId(this.Id);
		if(this.FamilyName != null)
			ifcPerson.setFamilyName(this.FamilyName);
		if(this.GivenName != null)
			ifcPerson.setGivenName(this.GivenName);
		if(this.MiddleNames != null)
			ifcPerson.setMiddleNames(this.MiddleNames);
		if(this.PrefixTitles != null)
			ifcPerson.setPrefixTitles(this.PrefixTitles);
		if(this.SuffixTitles != null)
			ifcPerson.setSuffixTitles(this.SuffixTitles);
		if(this.Roles != null)
			ifcPerson.setRoles(this.Roles);
		if(this.Addresses != null)
			ifcPerson.setAddresses(this.Addresses);
		return ifcPerson;
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
