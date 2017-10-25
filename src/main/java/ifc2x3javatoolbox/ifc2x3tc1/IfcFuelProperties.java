/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc2x3javatoolbox.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcFuelProperties<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcFuelProperties extends IfcMaterialProperties implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcMaterial","IfcThermodynamicTemperatureMeasure","IfcPositiveRatioMeasure","IfcHeatingValueMeasure","IfcHeatingValueMeasure"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** CombustionTemperature is an OPTIONAL attribute**/
	protected IfcThermodynamicTemperatureMeasure CombustionTemperature;
	/** CarbonContent is an OPTIONAL attribute**/
	protected IfcPositiveRatioMeasure CarbonContent;
	/** LowerHeatingValue is an OPTIONAL attribute**/
	protected IfcHeatingValueMeasure LowerHeatingValue;
	/** HigherHeatingValue is an OPTIONAL attribute**/
	protected IfcHeatingValueMeasure HigherHeatingValue;
	/**
	* The default constructor.
	**/
	public IfcFuelProperties(){}

	private static final String[] attributes = new String[]{"Material","CombustionTemperature","CarbonContent"
			,"LowerHeatingValue","HigherHeatingValue"};

	public String[] getAttributes() {
		return IfcFuelProperties.attributes;
	}

	/**
	* Constructs a new IfcFuelProperties object using the given parameters.
	*
	* @param Material DEMANDED parameter of type IfcMaterial - may not be null.
	* @param CombustionTemperature OPTIONAL parameter of type IfcThermodynamicTemperatureMeasure
	* @param CarbonContent OPTIONAL parameter of type IfcPositiveRatioMeasure
	* @param LowerHeatingValue OPTIONAL parameter of type IfcHeatingValueMeasure
	* @param HigherHeatingValue OPTIONAL parameter of type IfcHeatingValueMeasure
	**/
	public IfcFuelProperties(IfcMaterial Material, IfcThermodynamicTemperatureMeasure CombustionTemperature, IfcPositiveRatioMeasure CarbonContent, IfcHeatingValueMeasure LowerHeatingValue, IfcHeatingValueMeasure HigherHeatingValue)
	{
		this.Material = Material;
		this.CombustionTemperature = CombustionTemperature;
		this.CarbonContent = CarbonContent;
		this.LowerHeatingValue = LowerHeatingValue;
		this.HigherHeatingValue = HigherHeatingValue;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcFuelProperties object using the given parameters.
	*
	* @param Material DEMANDED parameter of type IfcMaterial - may not be null.
	* @param CombustionTemperature OPTIONAL parameter of type IfcThermodynamicTemperatureMeasure
	* @param CarbonContent OPTIONAL parameter of type IfcPositiveRatioMeasure
	* @param LowerHeatingValue OPTIONAL parameter of type IfcHeatingValueMeasure
	* @param HigherHeatingValue OPTIONAL parameter of type IfcHeatingValueMeasure
	**/
	public void setParameters(IfcMaterial Material, IfcThermodynamicTemperatureMeasure CombustionTemperature, IfcPositiveRatioMeasure CarbonContent, IfcHeatingValueMeasure LowerHeatingValue, IfcHeatingValueMeasure HigherHeatingValue)
	{
		this.Material = Material;
		this.CombustionTemperature = CombustionTemperature;
		this.CarbonContent = CarbonContent;
		this.LowerHeatingValue = LowerHeatingValue;
		this.HigherHeatingValue = HigherHeatingValue;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Material = (IfcMaterial) parameters.get(0);
		this.CombustionTemperature = (IfcThermodynamicTemperatureMeasure) parameters.get(1);
		this.CarbonContent = (IfcPositiveRatioMeasure) parameters.get(2);
		this.LowerHeatingValue = (IfcHeatingValueMeasure) parameters.get(3);
		this.HigherHeatingValue = (IfcHeatingValueMeasure) parameters.get(4);
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
		return IfcFuelProperties.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCFUELPROPERTIES(");
		if(getRedefinedDerivedAttributeTypes().contains("Material")) stepString = stepString.concat("*,");
		else{
		if(this.Material != null)		stepString = stepString.concat(((RootInterface)this.Material).getStepParameter(IfcMaterial.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("CombustionTemperature")) stepString = stepString.concat("*,");
		else{
		if(this.CombustionTemperature != null)		stepString = stepString.concat(((RootInterface)this.CombustionTemperature).getStepParameter(IfcThermodynamicTemperatureMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("CarbonContent")) stepString = stepString.concat("*,");
		else{
		if(this.CarbonContent != null)		stepString = stepString.concat(((RootInterface)this.CarbonContent).getStepParameter(IfcPositiveRatioMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("LowerHeatingValue")) stepString = stepString.concat("*,");
		else{
		if(this.LowerHeatingValue != null)		stepString = stepString.concat(((RootInterface)this.LowerHeatingValue).getStepParameter(IfcHeatingValueMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("HigherHeatingValue")) stepString = stepString.concat("*);");
		else{
		if(this.HigherHeatingValue != null)		stepString = stepString.concat(((RootInterface)this.HigherHeatingValue).getStepParameter(IfcHeatingValueMeasure.class.isInterface())+");");
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
	* This method sets the CombustionTemperature attribute to the given value.
	*
	* @param CombustionTemperature DEMANDED value to set - may not be null
	**/
	public void setCombustionTemperature(IfcThermodynamicTemperatureMeasure CombustionTemperature)
	{
		this.CombustionTemperature = CombustionTemperature;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the CombustionTemperature attribute.
	*
	* @return the value of CombustionTemperature
	/**/
	public IfcThermodynamicTemperatureMeasure getCombustionTemperature()
	{
		return this.CombustionTemperature;
	}

	/**
	* This method sets the CarbonContent attribute to the given value.
	*
	* @param CarbonContent DEMANDED value to set - may not be null
	**/
	public void setCarbonContent(IfcPositiveRatioMeasure CarbonContent)
	{
		this.CarbonContent = CarbonContent;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the CarbonContent attribute.
	*
	* @return the value of CarbonContent
	/**/
	public IfcPositiveRatioMeasure getCarbonContent()
	{
		return this.CarbonContent;
	}

	/**
	* This method sets the LowerHeatingValue attribute to the given value.
	*
	* @param LowerHeatingValue DEMANDED value to set - may not be null
	**/
	public void setLowerHeatingValue(IfcHeatingValueMeasure LowerHeatingValue)
	{
		this.LowerHeatingValue = LowerHeatingValue;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the LowerHeatingValue attribute.
	*
	* @return the value of LowerHeatingValue
	/**/
	public IfcHeatingValueMeasure getLowerHeatingValue()
	{
		return this.LowerHeatingValue;
	}

	/**
	* This method sets the HigherHeatingValue attribute to the given value.
	*
	* @param HigherHeatingValue DEMANDED value to set - may not be null
	**/
	public void setHigherHeatingValue(IfcHeatingValueMeasure HigherHeatingValue)
	{
		this.HigherHeatingValue = HigherHeatingValue;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the HigherHeatingValue attribute.
	*
	* @return the value of HigherHeatingValue
	/**/
	public IfcHeatingValueMeasure getHigherHeatingValue()
	{
		return this.HigherHeatingValue;
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
		IfcFuelProperties ifcFuelProperties = new IfcFuelProperties();
		if(this.Material != null)
			ifcFuelProperties.setMaterial((IfcMaterial)this.Material.clone());
		if(this.CombustionTemperature != null)
			ifcFuelProperties.setCombustionTemperature((IfcThermodynamicTemperatureMeasure)this.CombustionTemperature.clone());
		if(this.CarbonContent != null)
			ifcFuelProperties.setCarbonContent((IfcPositiveRatioMeasure)this.CarbonContent.clone());
		if(this.LowerHeatingValue != null)
			ifcFuelProperties.setLowerHeatingValue((IfcHeatingValueMeasure)this.LowerHeatingValue.clone());
		if(this.HigherHeatingValue != null)
			ifcFuelProperties.setHigherHeatingValue((IfcHeatingValueMeasure)this.HigherHeatingValue.clone());
		return ifcFuelProperties;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcFuelProperties ifcFuelProperties = new IfcFuelProperties();
		if(this.Material != null)
			ifcFuelProperties.setMaterial(this.Material);
		if(this.CombustionTemperature != null)
			ifcFuelProperties.setCombustionTemperature(this.CombustionTemperature);
		if(this.CarbonContent != null)
			ifcFuelProperties.setCarbonContent(this.CarbonContent);
		if(this.LowerHeatingValue != null)
			ifcFuelProperties.setLowerHeatingValue(this.LowerHeatingValue);
		if(this.HigherHeatingValue != null)
			ifcFuelProperties.setHigherHeatingValue(this.HigherHeatingValue);
		return ifcFuelProperties;
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
