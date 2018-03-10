package za.co.mmagon.jwebswing.plugins.bs4datetimepicker;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;
import za.co.mmagon.jwebswing.plugins.bs4datetimepicker.options.BS4DateTimePickerOptions;

import java.time.LocalDate;

public class BS4DateTimePickerInputOptionsTest
		extends BaseTestClass
{
	@Test
	public void getDate()
	{
		BS4DateTimePickerOptions options = new BS4DateTimePickerOptions();
		options.setDate(LocalDate.now());
		options.setFormat("L");
		System.out.println(options);
	}

}
