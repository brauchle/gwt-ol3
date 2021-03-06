/*******************************************************************************
 * Copyright 2014, 2017 gwt-ol3
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package ol.style;

import ol.GwtOLBaseTestCase;
import ol.OLFactory;

/**
 * Test for {@link ol.style.Circle}.
 * 
 * @author Tino Desjardins
 */
public class CircleTest extends GwtOLBaseTestCase {

    public void testCircle() {

        injectUrlAndTest(() -> {

            CircleOptions circleOptions = OLFactory.createOptions();
            circleOptions.setRadius(5);
            circleOptions.setSnapToPixel(true);

            Circle circleStyle = OLFactory.createCircleStyle(circleOptions);
            assertNotNull(circleStyle);
            assertEquals(5, circleStyle.getRadius());
            assertTrue(circleStyle.getSnapToPixel());

        });

    }
}
