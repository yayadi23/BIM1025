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
public interface IfcModelListener
{

	/**
	 * Invoked after an object has been added to the model.
	 * @param object
	 *            the corresponding object
	 */
	public void modelObjectAdded(ClassInterface object);

	/**
	 * Invoked after an object has been removed from the model.
	 * @param object
	 *            the corresponding object
	 */
	public void modelObjectRemoved(ClassInterface object);

	/**
	 * Invoked after objects have been added to the model.
	 * @param objects
	 *            the corresponding objects
	 */
	public void modelObjectsAdded(Collection<ClassInterface> objects);

	/**
	 * Invoked after objects have been removed from the model.
	 * @param objects
	 *            the corresponding objects
	 */
	public void modelObjectsRemoved(Collection<ClassInterface> objects);

	/**
	 * Invoked after the model's content has changed completely or fundamental.
	 */
	public void modelContentChanged();
}
