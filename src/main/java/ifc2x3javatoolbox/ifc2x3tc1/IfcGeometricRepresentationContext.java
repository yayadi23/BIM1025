/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc2x3javatoolbox.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcGeometricRepresentationContext<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcGeometricRepresentationContext extends IfcRepresentationContext implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcLabel","IfcLabel","IfcDimensionCount","DOUBLE","IfcAxis2Placement","IfcDirection"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** CoordinateSpaceDimension is an DEMANDED attribute - may not be null**/
	protected IfcDimensionCount CoordinateSpaceDimension;
	/** Precision is an OPTIONAL attribute**/
	protected DOUBLE Precision;
	/** WorldCoordinateSystem is an DEMANDED attribute - may not be null**/
	protected IfcAxis2Placement WorldCoordinateSystem;
	/** TrueNorth is an OPTIONAL attribute**/
	protected IfcDirection TrueNorth;
	protected SET<IfcGeometricRepresentationSubContext> HasSubContexts_Inverse;
	/**
	* The default constructor.
	**/
	public IfcGeometricRepresentationContext(){}

	private static final String[] attributes = new String[]{"ContextIdentifier","ContextType","CoordinateSpaceDimension"
	,"Precision","WorldCoordinateSystem","TrueNorth"};

	public String[] getAttributes() {
		return IfcGeometricRepresentationContext.attributes;
	}

	/**
	* Constructs a new IfcGeometricRepresentationContext object using the given parameters.
	*
	* @param ContextIdentifier OPTIONAL parameter of type IfcLabel
	* @param ContextType OPTIONAL parameter of type IfcLabel
	* @param CoordinateSpaceDimension DEMANDED parameter of type IfcDimensionCount - may not be null.
	* @param Precision OPTIONAL parameter of type DOUBLE
	* @param WorldCoordinateSystem DEMANDED parameter of type IfcAxis2Placement - may not be null.
	* @param TrueNorth OPTIONAL parameter of type IfcDirection
	**/
	public IfcGeometricRepresentationContext(IfcLabel ContextIdentifier, IfcLabel ContextType, IfcDimensionCount CoordinateSpaceDimension, DOUBLE Precision, IfcAxis2Placement WorldCoordinateSystem, IfcDirection TrueNorth)
	{
		this.ContextIdentifier = ContextIdentifier;
		this.ContextType = ContextType;
		this.CoordinateSpaceDimension = CoordinateSpaceDimension;
		this.Precision = Precision;
		this.WorldCoordinateSystem = WorldCoordinateSystem;
		this.TrueNorth = TrueNorth;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcGeometricRepresentationContext object using the given parameters.
	*
	* @param ContextIdentifier OPTIONAL parameter of type IfcLabel
	* @param ContextType OPTIONAL parameter of type IfcLabel
	* @param CoordinateSpaceDimension DEMANDED parameter of type IfcDimensionCount - may not be null.
	* @param Precision OPTIONAL parameter of type DOUBLE
	* @param WorldCoordinateSystem DEMANDED parameter of type IfcAxis2Placement - may not be null.
	* @param TrueNorth OPTIONAL parameter of type IfcDirection
	**/
	public void setParameters(IfcLabel ContextIdentifier, IfcLabel ContextType, IfcDimensionCount CoordinateSpaceDimension, DOUBLE Precision, IfcAxis2Placement WorldCoordinateSystem, IfcDirection TrueNorth)
	{
		this.ContextIdentifier = ContextIdentifier;
		this.ContextType = ContextType;
		this.CoordinateSpaceDimension = CoordinateSpaceDimension;
		this.Precision = Precision;
		this.WorldCoordinateSystem = WorldCoordinateSystem;
		this.TrueNorth = TrueNorth;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.ContextIdentifier = (IfcLabel) parameters.get(0);
		this.ContextType = (IfcLabel) parameters.get(1);
		this.CoordinateSpaceDimension = (IfcDimensionCount) parameters.get(2);
		this.Precision = (DOUBLE) parameters.get(3);
		this.WorldCoordinateSystem = (IfcAxis2Placement) parameters.get(4);
		this.TrueNorth = (IfcDirection) parameters.get(5);
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void destruct()
	{
		 super.destruct();
		listenerList = null;
		HasSubContexts_Inverse = null;
	}

	private void resolveInverses()
	{
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcGeometricRepresentationContext.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCGEOMETRICREPRESENTATIONCONTEXT(");
		if(getRedefinedDerivedAttributeTypes().contains("ContextIdentifier")) stepString = stepString.concat("*,");
		else{
		if(this.ContextIdentifier != null)		stepString = stepString.concat(((RootInterface)this.ContextIdentifier).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ContextType")) stepString = stepString.concat("*,");
		else{
		if(this.ContextType != null)		stepString = stepString.concat(((RootInterface)this.ContextType).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("CoordinateSpaceDimension")) stepString = stepString.concat("*,");
		else{
		if(this.CoordinateSpaceDimension != null)		stepString = stepString.concat(((RootInterface)this.CoordinateSpaceDimension).getStepParameter(IfcDimensionCount.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Precision")) stepString = stepString.concat("*,");
		else{
		if(this.Precision != null)		stepString = stepString.concat(((RootInterface)this.Precision).getStepParameter(DOUBLE.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("WorldCoordinateSystem")) stepString = stepString.concat("*,");
		else{
		if(this.WorldCoordinateSystem != null)		stepString = stepString.concat(((RootInterface)this.WorldCoordinateSystem).getStepParameter(IfcAxis2Placement.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("TrueNorth")) stepString = stepString.concat("*);");
		else{
		if(this.TrueNorth != null)		stepString = stepString.concat(((RootInterface)this.TrueNorth).getStepParameter(IfcDirection.class.isInterface())+");");
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
	* This method returns a copy of the set of the HasSubContexts_Inverse attribute.
	*
	* @return a copy of the HasSubContexts_Inverse set
	**/
	public SET<IfcGeometricRepresentationSubContext> getHasSubContexts_Inverse()
	{
		if(this.HasSubContexts_Inverse != null)
			return new SET<IfcGeometricRepresentationSubContext>(this.HasSubContexts_Inverse);
		return null;
	}

	/**
	* This method sets the CoordinateSpaceDimension attribute to the given value.
	*
	* @param CoordinateSpaceDimension OPTIONAL value to set
	**/
	public void setCoordinateSpaceDimension(IfcDimensionCount CoordinateSpaceDimension)
	{
		this.CoordinateSpaceDimension = CoordinateSpaceDimension;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the CoordinateSpaceDimension attribute.
	*
	* @return the value of CoordinateSpaceDimension
	/**/
	public IfcDimensionCount getCoordinateSpaceDimension()
	{
		return this.CoordinateSpaceDimension;
	}

	/**
	* This method sets the Precision attribute to the given value.
	*
	* @param Precision DEMANDED value to set - may not be null
	**/
	public void setPrecision(DOUBLE Precision)
	{
		this.Precision = Precision;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Precision attribute.
	*
	* @return the value of Precision
	/**/
	public DOUBLE getPrecision()
	{
		return this.Precision;
	}

	/**
	* This method sets the WorldCoordinateSystem attribute to the given value.
	*
	* @param WorldCoordinateSystem OPTIONAL value to set
	**/
	public void setWorldCoordinateSystem(IfcAxis2Placement WorldCoordinateSystem)
	{
		this.WorldCoordinateSystem = WorldCoordinateSystem;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the WorldCoordinateSystem attribute.
	*
	* @return the value of WorldCoordinateSystem
	/**/
	public IfcAxis2Placement getWorldCoordinateSystem()
	{
		return this.WorldCoordinateSystem;
	}

	/**
	* This method sets the TrueNorth attribute to the given value.
	*
	* @param TrueNorth DEMANDED value to set - may not be null
	**/
	public void setTrueNorth(IfcDirection TrueNorth)
	{
		this.TrueNorth = TrueNorth;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the TrueNorth attribute.
	*
	* @return the value of TrueNorth
	/**/
	public IfcDirection getTrueNorth()
	{
		return this.TrueNorth;
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
		IfcGeometricRepresentationContext ifcGeometricRepresentationContext = new IfcGeometricRepresentationContext();
		if(this.ContextIdentifier != null)
			ifcGeometricRepresentationContext.setContextIdentifier((IfcLabel)this.ContextIdentifier.clone());
		if(this.ContextType != null)
			ifcGeometricRepresentationContext.setContextType((IfcLabel)this.ContextType.clone());
		if(this.CoordinateSpaceDimension != null)
			ifcGeometricRepresentationContext.setCoordinateSpaceDimension((IfcDimensionCount)this.CoordinateSpaceDimension.clone());
		if(this.Precision != null)
			ifcGeometricRepresentationContext.setPrecision((DOUBLE)this.Precision.clone());
		if(this.WorldCoordinateSystem != null)
			ifcGeometricRepresentationContext.setWorldCoordinateSystem((IfcAxis2Placement)this.WorldCoordinateSystem.clone());
		if(this.TrueNorth != null)
			ifcGeometricRepresentationContext.setTrueNorth((IfcDirection)this.TrueNorth.clone());
		return ifcGeometricRepresentationContext;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcGeometricRepresentationContext ifcGeometricRepresentationContext = new IfcGeometricRepresentationContext();
		if(this.ContextIdentifier != null)
			ifcGeometricRepresentationContext.setContextIdentifier(this.ContextIdentifier);
		if(this.ContextType != null)
			ifcGeometricRepresentationContext.setContextType(this.ContextType);
		if(this.CoordinateSpaceDimension != null)
			ifcGeometricRepresentationContext.setCoordinateSpaceDimension(this.CoordinateSpaceDimension);
		if(this.Precision != null)
			ifcGeometricRepresentationContext.setPrecision(this.Precision);
		if(this.WorldCoordinateSystem != null)
			ifcGeometricRepresentationContext.setWorldCoordinateSystem(this.WorldCoordinateSystem);
		if(this.TrueNorth != null)
			ifcGeometricRepresentationContext.setTrueNorth(this.TrueNorth);
		return ifcGeometricRepresentationContext;
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
