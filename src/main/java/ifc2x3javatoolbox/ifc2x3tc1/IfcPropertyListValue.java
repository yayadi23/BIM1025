/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc2x3javatoolbox.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcPropertyListValue<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcPropertyListValue extends IfcSimpleProperty implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcIdentifier","IfcText","LIST<IfcValue>","IfcUnit"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** ListValues is an DEMANDED attribute - may not be null**/
	protected LIST<IfcValue> ListValues;
	/** Unit is an OPTIONAL attribute**/
	protected IfcUnit Unit;
	/**
	* The default constructor.
	**/
	public IfcPropertyListValue(){}

	private static final String[] attributes = new String[]{"Name","Description","ListValues","Unit"};

	public String[] getAttributes() {
		return IfcPropertyListValue.attributes;
	}

	/**
	* Constructs a new IfcPropertyListValue object using the given parameters.
	*
	* @param Name DEMANDED parameter of type IfcIdentifier - may not be null.
	* @param Description OPTIONAL parameter of type IfcText
	* @param ListValues DEMANDED parameter of type LIST<IfcValue> - may not be null.
	* @param Unit OPTIONAL parameter of type IfcUnit
	**/
	public IfcPropertyListValue(IfcIdentifier Name, IfcText Description, LIST<IfcValue> ListValues, IfcUnit Unit)
	{
		this.Name = Name;
		this.Description = Description;
		this.ListValues = ListValues;
		this.Unit = Unit;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcPropertyListValue object using the given parameters.
	*
	* @param Name DEMANDED parameter of type IfcIdentifier - may not be null.
	* @param Description OPTIONAL parameter of type IfcText
	* @param ListValues DEMANDED parameter of type LIST<IfcValue> - may not be null.
	* @param Unit OPTIONAL parameter of type IfcUnit
	**/
	public void setParameters(IfcIdentifier Name, IfcText Description, LIST<IfcValue> ListValues, IfcUnit Unit)
	{
		this.Name = Name;
		this.Description = Description;
		this.ListValues = ListValues;
		this.Unit = Unit;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Name = (IfcIdentifier) parameters.get(0);
		this.Description = (IfcText) parameters.get(1);
		this.ListValues = (LIST<IfcValue>) parameters.get(2);
		this.Unit = (IfcUnit) parameters.get(3);
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
		return IfcPropertyListValue.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCPROPERTYLISTVALUE(");
		if(getRedefinedDerivedAttributeTypes().contains("Name")) stepString = stepString.concat("*,");
		else{
		if(this.Name != null)		stepString = stepString.concat(((RootInterface)this.Name).getStepParameter(IfcIdentifier.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Description")) stepString = stepString.concat("*,");
		else{
		if(this.Description != null)		stepString = stepString.concat(((RootInterface)this.Description).getStepParameter(IfcText.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ListValues")) stepString = stepString.concat("*,");
		else{
		if(this.ListValues != null)		stepString = stepString.concat(((RootInterface)this.ListValues).getStepParameter(IfcValue.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Unit")) stepString = stepString.concat("*);");
		else{
		if(this.Unit != null)		stepString = stepString.concat(((RootInterface)this.Unit).getStepParameter(IfcUnit.class.isInterface())+");");
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
	* This method sets the ListValues attribute to the given value.
	*
	* @param ListValues OPTIONAL value to set
	**/
	public void setListValues(LIST<IfcValue> ListValues)
	{
		this.ListValues = ListValues;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the ListValues attribute.
	*
	* @return a copy of the ListValues list
	**/
	public LIST<IfcValue> getListValues()
	{
		if(this.ListValues != null)
			return new LIST<IfcValue>(this.ListValues);
		return null;
	}

	/**
	* This method adds an IfcValue object to the ListValues list.
	* @param ListValues element to be appended to this list.
	**/
	public void addListValues(IfcValue ListValues)
	{
		if(this.ListValues == null)
			this.ListValues = new LIST<IfcValue>();
		this.ListValues.add(ListValues);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcValue objects to the ListValues list.
	* @param ListValues collection containing elements to be added to this list.
	**/
	public void addAllListValues(java.util.Collection<IfcValue> ListValues)
	{
		if(this.ListValues == null)
			this.ListValues = new LIST<IfcValue>();
		this.ListValues.addAll(ListValues);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the ListValues list.
	**/
	public void clearListValues()
	{
		if(this.ListValues != null)
		{
			this.ListValues.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcValue object from the ListValues list.
	* @param ListValues element to be removed from this list.
	**/
	public void removeListValues(IfcValue ListValues)
	{
		if(this.ListValues != null)
		{
			this.ListValues.remove(ListValues);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcValue objects from the ListValues list.
	* @param ListValues collection containing elements to be removed from this list.
	**/
	public void removeAllListValues(java.util.Collection<IfcValue> ListValues)
	{
		if(this.ListValues != null)
		{
			this.ListValues.removeAll(ListValues);
			fireChangeEvent();
		}
	}

	/**
	* This method sets the Unit attribute to the given value.
	*
	* @param Unit DEMANDED value to set - may not be null
	**/
	public void setUnit(IfcUnit Unit)
	{
		this.Unit = Unit;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Unit attribute.
	*
	* @return the value of Unit
	/**/
	public IfcUnit getUnit()
	{
		return this.Unit;
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
		IfcPropertyListValue ifcPropertyListValue = new IfcPropertyListValue();
		if(this.Name != null)
			ifcPropertyListValue.setName((IfcIdentifier)this.Name.clone());
		if(this.Description != null)
			ifcPropertyListValue.setDescription((IfcText)this.Description.clone());
		if(this.ListValues != null)
			ifcPropertyListValue.setListValues((LIST<IfcValue>)this.ListValues.clone());
		if(this.Unit != null)
			ifcPropertyListValue.setUnit((IfcUnit)this.Unit.clone());
		return ifcPropertyListValue;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcPropertyListValue ifcPropertyListValue = new IfcPropertyListValue();
		if(this.Name != null)
			ifcPropertyListValue.setName(this.Name);
		if(this.Description != null)
			ifcPropertyListValue.setDescription(this.Description);
		if(this.ListValues != null)
			ifcPropertyListValue.setListValues(this.ListValues);
		if(this.Unit != null)
			ifcPropertyListValue.setUnit(this.Unit);
		return ifcPropertyListValue;
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
