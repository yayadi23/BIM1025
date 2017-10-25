/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc2x3javatoolbox.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcTrimmedCurve<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcTrimmedCurve extends IfcBoundedCurve implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcCurve","SET<IfcTrimmingSelect>","SET<IfcTrimmingSelect>","BOOLEAN","IfcTrimmingPreference"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** BasisCurve is an DEMANDED attribute - may not be null**/
	protected IfcCurve BasisCurve;
	/** Trim1 is an DEMANDED attribute - may not be null**/
	protected SET<IfcTrimmingSelect> Trim1;
	/** Trim2 is an DEMANDED attribute - may not be null**/
	protected SET<IfcTrimmingSelect> Trim2;
	/** SenseAgreement is an DEMANDED attribute - may not be null**/
	protected BOOLEAN SenseAgreement;
	/** MasterRepresentation is an DEMANDED attribute - may not be null**/
	protected IfcTrimmingPreference MasterRepresentation;
	/**
	* The default constructor.
	**/
	public IfcTrimmedCurve(){}

	private static final String[] attributes = new String[]{"BasisCurve","Trim1","Trim2","SenseAgreement",
			"MasterRepresentation"};

	public String[] getAttributes(){
		return IfcTrimmedCurve.attributes;
	}
	/**
	* Constructs a new IfcTrimmedCurve object using the given parameters.
	*
	* @param BasisCurve DEMANDED parameter of type IfcCurve - may not be null.
	* @param Trim1 DEMANDED parameter of type SET<IfcTrimmingSelect> - may not be null.
	* @param Trim2 DEMANDED parameter of type SET<IfcTrimmingSelect> - may not be null.
	* @param SenseAgreement DEMANDED parameter of type BOOLEAN - may not be null.
	* @param MasterRepresentation DEMANDED parameter of type IfcTrimmingPreference - may not be null.
	**/
	public IfcTrimmedCurve(IfcCurve BasisCurve, SET<IfcTrimmingSelect> Trim1, SET<IfcTrimmingSelect> Trim2, BOOLEAN SenseAgreement, IfcTrimmingPreference MasterRepresentation)
	{
		this.BasisCurve = BasisCurve;
		this.Trim1 = Trim1;
		this.Trim2 = Trim2;
		this.SenseAgreement = SenseAgreement;
		this.MasterRepresentation = MasterRepresentation;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcTrimmedCurve object using the given parameters.
	*
	* @param BasisCurve DEMANDED parameter of type IfcCurve - may not be null.
	* @param Trim1 DEMANDED parameter of type SET<IfcTrimmingSelect> - may not be null.
	* @param Trim2 DEMANDED parameter of type SET<IfcTrimmingSelect> - may not be null.
	* @param SenseAgreement DEMANDED parameter of type BOOLEAN - may not be null.
	* @param MasterRepresentation DEMANDED parameter of type IfcTrimmingPreference - may not be null.
	**/
	public void setParameters(IfcCurve BasisCurve, SET<IfcTrimmingSelect> Trim1, SET<IfcTrimmingSelect> Trim2, BOOLEAN SenseAgreement, IfcTrimmingPreference MasterRepresentation)
	{
		this.BasisCurve = BasisCurve;
		this.Trim1 = Trim1;
		this.Trim2 = Trim2;
		this.SenseAgreement = SenseAgreement;
		this.MasterRepresentation = MasterRepresentation;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.BasisCurve = (IfcCurve) parameters.get(0);
		this.Trim1 = (SET<IfcTrimmingSelect>) parameters.get(1);
		this.Trim2 = (SET<IfcTrimmingSelect>) parameters.get(2);
		this.SenseAgreement = (BOOLEAN) parameters.get(3);
		this.MasterRepresentation = (IfcTrimmingPreference) parameters.get(4);
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
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcTrimmedCurve.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCTRIMMEDCURVE(");
		if(getRedefinedDerivedAttributeTypes().contains("BasisCurve")) stepString = stepString.concat("*,");
		else{
		if(this.BasisCurve != null)		stepString = stepString.concat(((RootInterface)this.BasisCurve).getStepParameter(IfcCurve.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Trim1")) stepString = stepString.concat("*,");
		else{
		if(this.Trim1 != null)		stepString = stepString.concat(((RootInterface)this.Trim1).getStepParameter(IfcTrimmingSelect.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Trim2")) stepString = stepString.concat("*,");
		else{
		if(this.Trim2 != null)		stepString = stepString.concat(((RootInterface)this.Trim2).getStepParameter(IfcTrimmingSelect.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("SenseAgreement")) stepString = stepString.concat("*,");
		else{
		if(this.SenseAgreement != null)		stepString = stepString.concat(((RootInterface)this.SenseAgreement).getStepParameter(BOOLEAN.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("MasterRepresentation")) stepString = stepString.concat("*);");
		else{
		if(this.MasterRepresentation != null)		stepString = stepString.concat(((RootInterface)this.MasterRepresentation).getStepParameter(IfcTrimmingPreference.class.isInterface())+");");
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
	* This method sets the BasisCurve attribute to the given value.
	*
	* @param BasisCurve OPTIONAL value to set
	**/
	public void setBasisCurve(IfcCurve BasisCurve)
	{
		this.BasisCurve = BasisCurve;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the BasisCurve attribute.
	*
	* @return the value of BasisCurve
	/**/
	public IfcCurve getBasisCurve()
	{
		return this.BasisCurve;
	}

	/**
	* This method sets the Trim1 attribute to the given value.
	*
	* @param Trim1 OPTIONAL value to set
	**/
	public void setTrim1(SET<IfcTrimmingSelect> Trim1)
	{
		this.Trim1 = Trim1;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the set of the Trim1 attribute.
	*
	* @return a copy of the Trim1 set
	**/
	public SET<IfcTrimmingSelect> getTrim1()
	{
		if(this.Trim1 != null)
			return new SET<IfcTrimmingSelect>(this.Trim1);
		return null;
	}

	/**
	* This method adds an IfcTrimmingSelect object to the Trim1 set.
	* @param Trim1 element to be appended to this set.
	**/
	public void addTrim1(IfcTrimmingSelect Trim1)
	{
		if(this.Trim1 == null)
			this.Trim1 = new SET<IfcTrimmingSelect>();
		this.Trim1.add(Trim1);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcTrimmingSelect objects to the Trim1 set.
	* @param Trim1 collection containing elements to be added to this set.
	**/
	public void addAllTrim1(java.util.Collection<IfcTrimmingSelect> Trim1)
	{
		if(this.Trim1 == null)
			this.Trim1 = new SET<IfcTrimmingSelect>();
		this.Trim1.addAll(Trim1);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the Trim1 set.
	**/
	public void clearTrim1()
	{
		if(this.Trim1 != null)
		{
			this.Trim1.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcTrimmingSelect object from the Trim1 set.
	* @param Trim1 element to be removed from this set.
	**/
	public void removeTrim1(IfcTrimmingSelect Trim1)
	{
		if(this.Trim1 != null)
		{
			this.Trim1.remove(Trim1);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcTrimmingSelect objects from the Trim1 set.
	* @param Trim1 collection containing elements to be removed from this set.
	**/
	public void removeAllTrim1(java.util.Collection<IfcTrimmingSelect> Trim1)
	{
		if(this.Trim1 != null)
		{
			this.Trim1.removeAll(Trim1);
			fireChangeEvent();
		}
	}

	/**
	* This method sets the Trim2 attribute to the given value.
	*
	* @param Trim2 OPTIONAL value to set
	**/
	public void setTrim2(SET<IfcTrimmingSelect> Trim2)
	{
		this.Trim2 = Trim2;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the set of the Trim2 attribute.
	*
	* @return a copy of the Trim2 set
	**/
	public SET<IfcTrimmingSelect> getTrim2()
	{
		if(this.Trim2 != null)
			return new SET<IfcTrimmingSelect>(this.Trim2);
		return null;
	}

	/**
	* This method adds an IfcTrimmingSelect object to the Trim2 set.
	* @param Trim2 element to be appended to this set.
	**/
	public void addTrim2(IfcTrimmingSelect Trim2)
	{
		if(this.Trim2 == null)
			this.Trim2 = new SET<IfcTrimmingSelect>();
		this.Trim2.add(Trim2);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcTrimmingSelect objects to the Trim2 set.
	* @param Trim2 collection containing elements to be added to this set.
	**/
	public void addAllTrim2(java.util.Collection<IfcTrimmingSelect> Trim2)
	{
		if(this.Trim2 == null)
			this.Trim2 = new SET<IfcTrimmingSelect>();
		this.Trim2.addAll(Trim2);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the Trim2 set.
	**/
	public void clearTrim2()
	{
		if(this.Trim2 != null)
		{
			this.Trim2.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcTrimmingSelect object from the Trim2 set.
	* @param Trim2 element to be removed from this set.
	**/
	public void removeTrim2(IfcTrimmingSelect Trim2)
	{
		if(this.Trim2 != null)
		{
			this.Trim2.remove(Trim2);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcTrimmingSelect objects from the Trim2 set.
	* @param Trim2 collection containing elements to be removed from this set.
	**/
	public void removeAllTrim2(java.util.Collection<IfcTrimmingSelect> Trim2)
	{
		if(this.Trim2 != null)
		{
			this.Trim2.removeAll(Trim2);
			fireChangeEvent();
		}
	}

	/**
	* This method sets the SenseAgreement attribute to the given value.
	*
	* @param SenseAgreement OPTIONAL value to set
	**/
	public void setSenseAgreement(BOOLEAN SenseAgreement)
	{
		this.SenseAgreement = SenseAgreement;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the SenseAgreement attribute.
	*
	* @return the value of SenseAgreement
	/**/
	public BOOLEAN getSenseAgreement()
	{
		return this.SenseAgreement;
	}

	/**
	* This method sets the MasterRepresentation attribute to the given value.
	*
	* @param MasterRepresentation OPTIONAL value to set
	**/
	public void setMasterRepresentation(IfcTrimmingPreference MasterRepresentation)
	{
		this.MasterRepresentation = MasterRepresentation;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the MasterRepresentation attribute.
	*
	* @return the value of MasterRepresentation
	/**/
	public IfcTrimmingPreference getMasterRepresentation()
	{
		return this.MasterRepresentation;
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
		IfcTrimmedCurve ifcTrimmedCurve = new IfcTrimmedCurve();
		if(this.BasisCurve != null)
			ifcTrimmedCurve.setBasisCurve((IfcCurve)this.BasisCurve.clone());
		if(this.Trim1 != null)
			ifcTrimmedCurve.setTrim1((SET<IfcTrimmingSelect>)this.Trim1.clone());
		if(this.Trim2 != null)
			ifcTrimmedCurve.setTrim2((SET<IfcTrimmingSelect>)this.Trim2.clone());
		if(this.SenseAgreement != null)
			ifcTrimmedCurve.setSenseAgreement((BOOLEAN)this.SenseAgreement.clone());
		if(this.MasterRepresentation != null)
			ifcTrimmedCurve.setMasterRepresentation((IfcTrimmingPreference)this.MasterRepresentation.clone());
		return ifcTrimmedCurve;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcTrimmedCurve ifcTrimmedCurve = new IfcTrimmedCurve();
		if(this.BasisCurve != null)
			ifcTrimmedCurve.setBasisCurve(this.BasisCurve);
		if(this.Trim1 != null)
			ifcTrimmedCurve.setTrim1(this.Trim1);
		if(this.Trim2 != null)
			ifcTrimmedCurve.setTrim2(this.Trim2);
		if(this.SenseAgreement != null)
			ifcTrimmedCurve.setSenseAgreement(this.SenseAgreement);
		if(this.MasterRepresentation != null)
			ifcTrimmedCurve.setMasterRepresentation(this.MasterRepresentation);
		return ifcTrimmedCurve;
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