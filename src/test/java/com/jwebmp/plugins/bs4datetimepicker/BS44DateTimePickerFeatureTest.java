/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.bs4datetimepicker;

import com.jwebmp.plugins.bs4.datetimepicker.BS44DateTimePickerFeature;
import com.jwebmp.plugins.bs4.datetimepicker.BS4DateTimePicker;
import org.junit.jupiter.api.Test;

public class BS44DateTimePickerFeatureTest

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
