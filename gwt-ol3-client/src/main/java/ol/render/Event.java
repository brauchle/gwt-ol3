/*******************************************************************************
 * Copyright 2017, 2017 gwt-ol3
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
package ol.render;

import elemental2.dom.CanvasRenderingContext2D;
import jsinterop.annotations.JsProperty;

import jsinterop.annotations.JsType;
import ol.FrameState;

/**
 *
 * @author Tino Desjardins
 */
@JsType(isNative = true)
public interface Event extends ol.events.Event {

    /**
     * Canvas context. Only available when a Canvas renderer is used, null otherwise.
     *
     * @return Canvas context
     */
    @JsProperty
    CanvasRenderingContext2D getContext();

    /**
     * An object representing the current render frame state.
     *
     * @return current render frame state
     */
    @JsProperty
    FrameState getFrameState();

    /**
     * For canvas, this is an instance of {@link ol.render.canvas.Immediate}.
     */
    @JsProperty
    VectorContext getVectorContext();

}
