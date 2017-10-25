/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc2x3javatoolbox.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcCartesianTransformationOperator3D<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcCartesianTransformationOperator3D extends IfcCartesianTransformationOperator implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcDirection","IfcDirection","IfcCartesianPoint","DOUBLE","IfcDirection"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Axis3 is an OPTIONAL attribute**/
	protected IfcDirection Axis3;
	/**
	* The default constructor.
	**/
	public IfcCartesianTransformationOperator3D(){}

	private static final String[] attributes = new String[]{"Axis1","Axis2","LocalOrigin","Scale","Axis3"};

	public String[] getAttributes() {
		return IfcCartesianTransformationOperator3D.attributes;
	}

	/**
	* Constructs a new IfcCartesianTransformationOperator3D object using the given parameters.
	*
	* @param Axis1 OPTIONAL parameter of type IfcDirection
	* @param Axis2 OPTIONAL parameter of type IfcDirection
	* @param LocalOrigin DEMANDED parameter of type IfcCartesianPoint - may not be null.
	* @param Scale OPTIONAL parameter of type DOUBLE
	* @param Axis3 OPTIONAL parameter of type IfcDirection
	**/
	public IfcCartesianTransformationOperator3D(IfcDirection Axis1, IfcDirection Axis2, IfcCartesianPoint LocalOrigin, DOUBLE Scale, IfcDirection Axis3)
	{
		this.Axis1 = Axis1;
		this.Axis2 = Axis2;
		this.LocalOrigin = LocalOrigin;
		this.Scale = Scale;
		this.Axis3 = Axis3;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcCartesianTransformationOperator3D object using the given parameters.
	*
	* @param Axis1 OPTIONAL parameter of type IfcDirection
	* @param Axis2 OPTIONAL parameter of type IfcDirection
	* @param LocalOrigin DEMANDED parameter of type IfcCartesianPoint - may not be null.
	* @param Scale OPTIONAL parameter of type DOUBLE
	* @param Axis3 OPTIONAL parameter of type IfcDirection
	**/
	public void setParameters(IfcDirection Axis1, IfcDirection Axis2, IfcCartesianPoint LocalOrigin, DOUBLE Scale, IfcDirection Axis3)
	{
		this.Axis1 = Axis1;
		this.Axis2 = Axis2;
		this.LocalOrigin = LocalOrigin;
		this.Scale = Scale;
		this.Axis3 = Axis3;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Axis1 = (IfcDirection) parameters.get(0);
		this.Axis2 = (IfcDirection) parameters.get(1);
		this.LocalOrigin = (IfcCartesianPoint) parameters.get(2);
		this.Scale = (DOUBLE) parameters.get(3);
		this.Axis3 = (IfcDirection) parameters.get(4);
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
		return IfcCartesianTransformationOperator3D.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCCARTESIANTRANSFORMATIONOPERATOR3D(");
		if(getRedefinedDerivedAttributeTypes().contains("Axis1")) stepString = stepString.concat("*,");
		else{
		if(this.Axis1 != null)		stepString = stepString.concat(((RootInterface)this.Axis1).getStepParameter(IfcDirection.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Axis2")) stepString = stepString.concat("*,");
		else{
		if(this.Axis2 != null)		stepString = stepString.concat(((RootInterface)this.Axis2).getStepParameter(IfcDirection.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("LocalOrigin")) stepString = stepString.concat("*,");
		else{
		if(this.LocalOrigin != null)		stepString = stepString.concat(((RootInterface)this.LocalOrigin).getStepParameter(IfcCartesianPoint.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Scale")) stepString = stepString.concat("*,");
		else{
		if(this.Scale != null)		stepString = stepString.concat(((RootInterface)this.Scale).getStepParameter(DOUBLE.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Axis3")) stepString = stepString.concat("*);");
		else{
		if(this.Axis3 != null)		stepString = stepString.concat(((RootInterface)this.Axis3).getStepParameter(IfcDirection.class.isInterface())+");");
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
	* This method sets the Axis3 attribute to the given value.
	*
	* @param Axis3 DEMANDED value to set - may not be null
	**/
	public void setAxis3(IfcDirection Axis3)
	{
		this.Axis3 = Axis3;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Axis3 attribute.
	*
	* @return the value of Axis3
	/**/
	public IfcDirection getAxis3()
	{
		return this.Axis3;
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
		IfcCartesianTransformationOperator3D ifcCartesianTransformationOperator3D = new IfcCartesianTransformationOperator3D();
		if(this.Axis1 != null)
			ifcCartesianTransformationOperator3D.setAxis1((IfcDirection)this.Axis1.clone());
		if(this.Axis2 != null)
			ifcCartesianTransformationOperator3D.setAxis2((IfcDirection)this.Axis2.clone());
		if(this.LocalOrigin != null)
			ifcCartesianTransformationOperator3D.setLocalOrigin((IfcCartesianPoint)this.LocalOrigin.clone());
		if(this.Scale != null)
			ifcCartesianTransformationOperator3D.setScale((DOUBLE)this.Scale.clone());
		if(this.Axis3 != null)
			ifcCartesianTransformationOperator3D.setAxis3((IfcDirection)this.Axis3.clone());
		return ifcCartesianTransformationOperator3D;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcCartesianTransformationOperator3D ifcCartesianTransformationOperator3D = new IfcCartesianTransformationOperator3D();
		if(this.Axis1 != null)
			ifcCartesianTransformationOperator3D.setAxis1(this.Axis1);
		if(this.Axis2 != null)
			ifcCartesianTransformationOperator3D.setAxis2(this.Axis2);
		if(this.LocalOrigin != null)
			ifcCartesianTransformationOperator3D.setLocalOrigin(this.LocalOrigin);
		if(this.Scale != null)
			ifcCartesianTransformationOperator3D.setScale(this.Scale);
		if(this.Axis3 != null)
			ifcCartesianTransformationOperator3D.setAxis3(this.Axis3);
		return ifcCartesianTransformationOperator3D;
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