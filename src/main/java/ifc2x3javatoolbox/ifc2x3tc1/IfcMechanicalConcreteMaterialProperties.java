/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc2x3javatoolbox.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcMechanicalConcreteMaterialProperties<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcMechanicalConcreteMaterialProperties extends IfcMechanicalMaterialProperties implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcMaterial","IfcDynamicViscosityMeasure","IfcModulusOfElasticityMeasure","IfcModulusOfElasticityMeasure","IfcPositiveRatioMeasure","IfcThermalExpansionCoefficientMeasure","IfcPressureMeasure","IfcPositiveLengthMeasure","IfcText","IfcText","IfcNormalisedRatioMeasure","IfcText"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** CompressiveStrength is an OPTIONAL attribute**/
	protected IfcPressureMeasure CompressiveStrength;
	/** MaxAggregateSize is an OPTIONAL attribute**/
	protected IfcPositiveLengthMeasure MaxAggregateSize;
	/** AdmixturesDescription is an OPTIONAL attribute**/
	protected IfcText AdmixturesDescription;
	/** Workability is an OPTIONAL attribute**/
	protected IfcText Workability;
	/** ProtectivePoreRatio is an OPTIONAL attribute**/
	protected IfcNormalisedRatioMeasure ProtectivePoreRatio;
	/** WaterImpermeability is an OPTIONAL attribute**/
	protected IfcText WaterImpermeability;
	/**
	* The default constructor.
	**/
	public IfcMechanicalConcreteMaterialProperties(){}

	private static final String[] attributes = new String[]{"Material","DynamicViscosity","YoungModulus"
	,"ShearModulus","PoissonRatio","ThermalExpansionCoefficient","CompressiveStrength"
	,"MaxAggregateSize","AdmixturesDescription","Workability","ProtectivePoreRatio","WaterImpermeability"};

	public String[] getAttributes() {
		return IfcMechanicalConcreteMaterialProperties.attributes;
	}

	/**
	* Constructs a new IfcMechanicalConcreteMaterialProperties object using the given parameters.
	*
	* @param Material DEMANDED parameter of type IfcMaterial - may not be null.
	* @param DynamicViscosity OPTIONAL parameter of type IfcDynamicViscosityMeasure
	* @param YoungModulus OPTIONAL parameter of type IfcModulusOfElasticityMeasure
	* @param ShearModulus OPTIONAL parameter of type IfcModulusOfElasticityMeasure
	* @param PoissonRatio OPTIONAL parameter of type IfcPositiveRatioMeasure
	* @param ThermalExpansionCoefficient OPTIONAL parameter of type IfcThermalExpansionCoefficientMeasure
	* @param CompressiveStrength OPTIONAL parameter of type IfcPressureMeasure
	* @param MaxAggregateSize OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param AdmixturesDescription OPTIONAL parameter of type IfcText
	* @param Workability OPTIONAL parameter of type IfcText
	* @param ProtectivePoreRatio OPTIONAL parameter of type IfcNormalisedRatioMeasure
	* @param WaterImpermeability OPTIONAL parameter of type IfcText
	**/
	public IfcMechanicalConcreteMaterialProperties(IfcMaterial Material, IfcDynamicViscosityMeasure DynamicViscosity, IfcModulusOfElasticityMeasure YoungModulus, IfcModulusOfElasticityMeasure ShearModulus, IfcPositiveRatioMeasure PoissonRatio, IfcThermalExpansionCoefficientMeasure ThermalExpansionCoefficient, IfcPressureMeasure CompressiveStrength, IfcPositiveLengthMeasure MaxAggregateSize, IfcText AdmixturesDescription, IfcText Workability, IfcNormalisedRatioMeasure ProtectivePoreRatio, IfcText WaterImpermeability)
	{
		this.Material = Material;
		this.DynamicViscosity = DynamicViscosity;
		this.YoungModulus = YoungModulus;
		this.ShearModulus = ShearModulus;
		this.PoissonRatio = PoissonRatio;
		this.ThermalExpansionCoefficient = ThermalExpansionCoefficient;
		this.CompressiveStrength = CompressiveStrength;
		this.MaxAggregateSize = MaxAggregateSize;
		this.AdmixturesDescription = AdmixturesDescription;
		this.Workability = Workability;
		this.ProtectivePoreRatio = ProtectivePoreRatio;
		this.WaterImpermeability = WaterImpermeability;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcMechanicalConcreteMaterialProperties object using the given parameters.
	*
	* @param Material DEMANDED parameter of type IfcMaterial - may not be null.
	* @param DynamicViscosity OPTIONAL parameter of type IfcDynamicViscosityMeasure
	* @param YoungModulus OPTIONAL parameter of type IfcModulusOfElasticityMeasure
	* @param ShearModulus OPTIONAL parameter of type IfcModulusOfElasticityMeasure
	* @param PoissonRatio OPTIONAL parameter of type IfcPositiveRatioMeasure
	* @param ThermalExpansionCoefficient OPTIONAL parameter of type IfcThermalExpansionCoefficientMeasure
	* @param CompressiveStrength OPTIONAL parameter of type IfcPressureMeasure
	* @param MaxAggregateSize OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param AdmixturesDescription OPTIONAL parameter of type IfcText
	* @param Workability OPTIONAL parameter of type IfcText
	* @param ProtectivePoreRatio OPTIONAL parameter of type IfcNormalisedRatioMeasure
	* @param WaterImpermeability OPTIONAL parameter of type IfcText
	**/
	public void setParameters(IfcMaterial Material, IfcDynamicViscosityMeasure DynamicViscosity, IfcModulusOfElasticityMeasure YoungModulus, IfcModulusOfElasticityMeasure ShearModulus, IfcPositiveRatioMeasure PoissonRatio, IfcThermalExpansionCoefficientMeasure ThermalExpansionCoefficient, IfcPressureMeasure CompressiveStrength, IfcPositiveLengthMeasure MaxAggregateSize, IfcText AdmixturesDescription, IfcText Workability, IfcNormalisedRatioMeasure ProtectivePoreRatio, IfcText WaterImpermeability)
	{
		this.Material = Material;
		this.DynamicViscosity = DynamicViscosity;
		this.YoungModulus = YoungModulus;
		this.ShearModulus = ShearModulus;
		this.PoissonRatio = PoissonRatio;
		this.ThermalExpansionCoefficient = ThermalExpansionCoefficient;
		this.CompressiveStrength = CompressiveStrength;
		this.MaxAggregateSize = MaxAggregateSize;
		this.AdmixturesDescription = AdmixturesDescription;
		this.Workability = Workability;
		this.ProtectivePoreRatio = ProtectivePoreRatio;
		this.WaterImpermeability = WaterImpermeability;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Material = (IfcMaterial) parameters.get(0);
		this.DynamicViscosity = (IfcDynamicViscosityMeasure) parameters.get(1);
		this.YoungModulus = (IfcModulusOfElasticityMeasure) parameters.get(2);
		this.ShearModulus = (IfcModulusOfElasticityMeasure) parameters.get(3);
		this.PoissonRatio = (IfcPositiveRatioMeasure) parameters.get(4);
		this.ThermalExpansionCoefficient = (IfcThermalExpansionCoefficientMeasure) parameters.get(5);
		this.CompressiveStrength = (IfcPressureMeasure) parameters.get(6);
		this.MaxAggregateSize = (IfcPositiveLengthMeasure) parameters.get(7);
		this.AdmixturesDescription = (IfcText) parameters.get(8);
		this.Workability = (IfcText) parameters.get(9);
		this.ProtectivePoreRatio = (IfcNormalisedRatioMeasure) parameters.get(10);
		this.WaterImpermeability = (IfcText) parameters.get(11);
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
		return IfcMechanicalConcreteMaterialProperties.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCMECHANICALCONCRETEMATERIALPROPERTIES(");
		if(getRedefinedDerivedAttributeTypes().contains("Material")) stepString = stepString.concat("*,");
		else{
		if(this.Material != null)		stepString = stepString.concat(((RootInterface)this.Material).getStepParameter(IfcMaterial.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("DynamicViscosity")) stepString = stepString.concat("*,");
		else{
		if(this.DynamicViscosity != null)		stepString = stepString.concat(((RootInterface)this.DynamicViscosity).getStepParameter(IfcDynamicViscosityMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("YoungModulus")) stepString = stepString.concat("*,");
		else{
		if(this.YoungModulus != null)		stepString = stepString.concat(((RootInterface)this.YoungModulus).getStepParameter(IfcModulusOfElasticityMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ShearModulus")) stepString = stepString.concat("*,");
		else{
		if(this.ShearModulus != null)		stepString = stepString.concat(((RootInterface)this.ShearModulus).getStepParameter(IfcModulusOfElasticityMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("PoissonRatio")) stepString = stepString.concat("*,");
		else{
		if(this.PoissonRatio != null)		stepString = stepString.concat(((RootInterface)this.PoissonRatio).getStepParameter(IfcPositiveRatioMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ThermalExpansionCoefficient")) stepString = stepString.concat("*,");
		else{
		if(this.ThermalExpansionCoefficient != null)		stepString = stepString.concat(((RootInterface)this.ThermalExpansionCoefficient).getStepParameter(IfcThermalExpansionCoefficientMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("CompressiveStrength")) stepString = stepString.concat("*,");
		else{
		if(this.CompressiveStrength != null)		stepString = stepString.concat(((RootInterface)this.CompressiveStrength).getStepParameter(IfcPressureMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("MaxAggregateSize")) stepString = stepString.concat("*,");
		else{
		if(this.MaxAggregateSize != null)		stepString = stepString.concat(((RootInterface)this.MaxAggregateSize).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("AdmixturesDescription")) stepString = stepString.concat("*,");
		else{
		if(this.AdmixturesDescription != null)		stepString = stepString.concat(((RootInterface)this.AdmixturesDescription).getStepParameter(IfcText.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Workability")) stepString = stepString.concat("*,");
		else{
		if(this.Workability != null)		stepString = stepString.concat(((RootInterface)this.Workability).getStepParameter(IfcText.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ProtectivePoreRatio")) stepString = stepString.concat("*,");
		else{
		if(this.ProtectivePoreRatio != null)		stepString = stepString.concat(((RootInterface)this.ProtectivePoreRatio).getStepParameter(IfcNormalisedRatioMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("WaterImpermeability")) stepString = stepString.concat("*);");
		else{
		if(this.WaterImpermeability != null)		stepString = stepString.concat(((RootInterface)this.WaterImpermeability).getStepParameter(IfcText.class.isInterface())+");");
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
	* This method sets the CompressiveStrength attribute to the given value.
	*
	* @param CompressiveStrength DEMANDED value to set - may not be null
	**/
	public void setCompressiveStrength(IfcPressureMeasure CompressiveStrength)
	{
		this.CompressiveStrength = CompressiveStrength;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the CompressiveStrength attribute.
	*
	* @return the value of CompressiveStrength
	/**/
	public IfcPressureMeasure getCompressiveStrength()
	{
		return this.CompressiveStrength;
	}

	/**
	* This method sets the MaxAggregateSize attribute to the given value.
	*
	* @param MaxAggregateSize DEMANDED value to set - may not be null
	**/
	public void setMaxAggregateSize(IfcPositiveLengthMeasure MaxAggregateSize)
	{
		this.MaxAggregateSize = MaxAggregateSize;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the MaxAggregateSize attribute.
	*
	* @return the value of MaxAggregateSize
	/**/
	public IfcPositiveLengthMeasure getMaxAggregateSize()
	{
		return this.MaxAggregateSize;
	}

	/**
	* This method sets the AdmixturesDescription attribute to the given value.
	*
	* @param AdmixturesDescription DEMANDED value to set - may not be null
	**/
	public void setAdmixturesDescription(IfcText AdmixturesDescription)
	{
		this.AdmixturesDescription = AdmixturesDescription;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the AdmixturesDescription attribute.
	*
	* @return the value of AdmixturesDescription
	/**/
	public IfcText getAdmixturesDescription()
	{
		return this.AdmixturesDescription;
	}

	/**
	* This method sets the Workability attribute to the given value.
	*
	* @param Workability DEMANDED value to set - may not be null
	**/
	public void setWorkability(IfcText Workability)
	{
		this.Workability = Workability;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Workability attribute.
	*
	* @return the value of Workability
	/**/
	public IfcText getWorkability()
	{
		return this.Workability;
	}

	/**
	* This method sets the ProtectivePoreRatio attribute to the given value.
	*
	* @param ProtectivePoreRatio DEMANDED value to set - may not be null
	**/
	public void setProtectivePoreRatio(IfcNormalisedRatioMeasure ProtectivePoreRatio)
	{
		this.ProtectivePoreRatio = ProtectivePoreRatio;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ProtectivePoreRatio attribute.
	*
	* @return the value of ProtectivePoreRatio
	/**/
	public IfcNormalisedRatioMeasure getProtectivePoreRatio()
	{
		return this.ProtectivePoreRatio;
	}

	/**
	* This method sets the WaterImpermeability attribute to the given value.
	*
	* @param WaterImpermeability DEMANDED value to set - may not be null
	**/
	public void setWaterImpermeability(IfcText WaterImpermeability)
	{
		this.WaterImpermeability = WaterImpermeability;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the WaterImpermeability attribute.
	*
	* @return the value of WaterImpermeability
	/**/
	public IfcText getWaterImpermeability()
	{
		return this.WaterImpermeability;
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
		IfcMechanicalConcreteMaterialProperties ifcMechanicalConcreteMaterialProperties = new IfcMechanicalConcreteMaterialProperties();
		if(this.Material != null)
			ifcMechanicalConcreteMaterialProperties.setMaterial((IfcMaterial)this.Material.clone());
		if(this.DynamicViscosity != null)
			ifcMechanicalConcreteMaterialProperties.setDynamicViscosity((IfcDynamicViscosityMeasure)this.DynamicViscosity.clone());
		if(this.YoungModulus != null)
			ifcMechanicalConcreteMaterialProperties.setYoungModulus((IfcModulusOfElasticityMeasure)this.YoungModulus.clone());
		if(this.ShearModulus != null)
			ifcMechanicalConcreteMaterialProperties.setShearModulus((IfcModulusOfElasticityMeasure)this.ShearModulus.clone());
		if(this.PoissonRatio != null)
			ifcMechanicalConcreteMaterialProperties.setPoissonRatio((IfcPositiveRatioMeasure)this.PoissonRatio.clone());
		if(this.ThermalExpansionCoefficient != null)
			ifcMechanicalConcreteMaterialProperties.setThermalExpansionCoefficient((IfcThermalExpansionCoefficientMeasure)this.ThermalExpansionCoefficient.clone());
		if(this.CompressiveStrength != null)
			ifcMechanicalConcreteMaterialProperties.setCompressiveStrength((IfcPressureMeasure)this.CompressiveStrength.clone());
		if(this.MaxAggregateSize != null)
			ifcMechanicalConcreteMaterialProperties.setMaxAggregateSize((IfcPositiveLengthMeasure)this.MaxAggregateSize.clone());
		if(this.AdmixturesDescription != null)
			ifcMechanicalConcreteMaterialProperties.setAdmixturesDescription((IfcText)this.AdmixturesDescription.clone());
		if(this.Workability != null)
			ifcMechanicalConcreteMaterialProperties.setWorkability((IfcText)this.Workability.clone());
		if(this.ProtectivePoreRatio != null)
			ifcMechanicalConcreteMaterialProperties.setProtectivePoreRatio((IfcNormalisedRatioMeasure)this.ProtectivePoreRatio.clone());
		if(this.WaterImpermeability != null)
			ifcMechanicalConcreteMaterialProperties.setWaterImpermeability((IfcText)this.WaterImpermeability.clone());
		return ifcMechanicalConcreteMaterialProperties;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcMechanicalConcreteMaterialProperties ifcMechanicalConcreteMaterialProperties = new IfcMechanicalConcreteMaterialProperties();
		if(this.Material != null)
			ifcMechanicalConcreteMaterialProperties.setMaterial(this.Material);
		if(this.DynamicViscosity != null)
			ifcMechanicalConcreteMaterialProperties.setDynamicViscosity(this.DynamicViscosity);
		if(this.YoungModulus != null)
			ifcMechanicalConcreteMaterialProperties.setYoungModulus(this.YoungModulus);
		if(this.ShearModulus != null)
			ifcMechanicalConcreteMaterialProperties.setShearModulus(this.ShearModulus);
		if(this.PoissonRatio != null)
			ifcMechanicalConcreteMaterialProperties.setPoissonRatio(this.PoissonRatio);
		if(this.ThermalExpansionCoefficient != null)
			ifcMechanicalConcreteMaterialProperties.setThermalExpansionCoefficient(this.ThermalExpansionCoefficient);
		if(this.CompressiveStrength != null)
			ifcMechanicalConcreteMaterialProperties.setCompressiveStrength(this.CompressiveStrength);
		if(this.MaxAggregateSize != null)
			ifcMechanicalConcreteMaterialProperties.setMaxAggregateSize(this.MaxAggregateSize);
		if(this.AdmixturesDescription != null)
			ifcMechanicalConcreteMaterialProperties.setAdmixturesDescription(this.AdmixturesDescription);
		if(this.Workability != null)
			ifcMechanicalConcreteMaterialProperties.setWorkability(this.Workability);
		if(this.ProtectivePoreRatio != null)
			ifcMechanicalConcreteMaterialProperties.setProtectivePoreRatio(this.ProtectivePoreRatio);
		if(this.WaterImpermeability != null)
			ifcMechanicalConcreteMaterialProperties.setWaterImpermeability(this.WaterImpermeability);
		return ifcMechanicalConcreteMaterialProperties;
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
