package ifc2x3javatoolbox.ifcmodel;
import ifc2x3javatoolbox.ifc2x3tc1.ClassInterface;
import java.util.Collection;
/**
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcModelEvent
{
	public static final int OBJECTS_ADDED = 0;
	public static final int OBJECTS_REMOVED = 1;
	public static final int MODEL_FUNDAMENTAL_CHANGE = 2;
	public static final int OBJECT_ADDED = 4;
	public static final int OBJECT_REMOVED = 5;

	private int type = -1;
	private Collection<ClassInterface> objects = null;
	private ClassInterface object = null;

	/**
	 * Constructs a new IfcModelEvent using the given parameters.
	 * @param type
	 *            the event type
	 */
	public IfcModelEvent(int type)
	{
		this.type = type;
	}

	/**
	 * Constructs a new IfcModelEvent using the given parameters.
	 * @param type
	 *            the event type
	 * @param objects
	 *            the objects corresponding to the changes
	 */
	public IfcModelEvent(int type, Collection<ClassInterface> objects)
	{
		this.type = type;
		this.objects = objects;
	}

	/**
	 * Constructs a new IfcModelEvent using the given parameters.
	 * @param type
	 *            the event type
	 * @param object
	 *            the object corresponding to the changes
	 */
	public IfcModelEvent(int type, ClassInterface object)
	{
		this.type = type;
		this.object = object;
	}

	/**
	 * This method returns the type of the event.
	 * @return the event type
	 */
	public int getType() {
		return type;
	}

	/**
	 * This method returns a collection of objects that correspond to the event.
	 * @return collection of objects that correspond to the event
	 */
	public Collection<ClassInterface> getObjects() {
		return objects;
	}

	/**
	 * This method returns an object that corresponds to the event.
	 * @return an object corresponding to the event
	 */
	public ClassInterface getObject() {
		return this.object;
	}

}
