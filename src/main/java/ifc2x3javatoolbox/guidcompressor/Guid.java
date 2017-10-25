package ifc2x3javatoolbox.guidcompressor;
/**
 * This class is a simple data type used during the conversion between
 * compressed and uncompressed string representations of GUIDs use within the
 * Industry Foundation Classes (IFC). It is equivalent to the struct _GUID in
 * the c implementation of the algorithm as follows:<br>
 * originally proposed by Jim Forester<br>
 * implemented previously by Jeremy Tammik using hex-encoding<br>
 * Peter Muigg, June 1998<br>
 * Janos Maros, July 2000<br>
 * This class is provided as-is with no warranty.<br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class Guid
{
	long Data1;
	int Data2;
	int Data3;
	char[] Data4 = new char[8];
}
