package za.co.mmagon.jwebswing.plugins.bs4datetimepicker.options;

import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

/**
 * Takes an object parameter that can contain two keys vertical and horizontal each having a value of 'auto', 'top', 'bottom' for vertical and 'auto', 'left', 'right' for horizontal which defines where the dropdown with the widget will appear relative to the input element the component is attached to.
 
 'auto' is the default value for both horizontal and vertical keys and it tries to automatically place the dropdown in a position that is visible to the user. Usually you should not override those options unless you have a special need in your layout.
 */
public class BS4DateTimeWidgetPositioningOptions extends JavaScriptPart<BS4DateTimeWidgetPositioningOptions>
{
	private BS4DateTimeWidgetPositions horizontal;
	private BS4DateTimeWidgetPositions vertical;
	
	public BS4DateTimeWidgetPositioningOptions()
	{
	}
	
	public BS4DateTimeWidgetPositions getVertical()
	{
		return vertical;
	}
	
	public void setVertical(BS4DateTimeWidgetPositions vertical)
	{
		this.vertical = vertical;
	}
}
