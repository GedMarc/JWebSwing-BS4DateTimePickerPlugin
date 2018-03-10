package za.co.mmagon.jwebswing.plugins.bs4datetimepicker;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;

public class BS44DateTimePickerFeatureTest
		extends BaseTestClass
{
	@Test
	public void getOptions()
	{
		BS44DateTimePickerFeature f = new BS44DateTimePickerFeature(new BS4DateTimePicker());
		f.getOptions()
		 .setFormat("stuff");
		System.out.println(f.renderJavascript());

	}

}
