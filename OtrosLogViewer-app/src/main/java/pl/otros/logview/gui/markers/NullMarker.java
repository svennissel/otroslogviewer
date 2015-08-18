/*******************************************************************************
 * Copyright 2011 Krzysztof Otrebski
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package pl.otros.logview.gui.markers;

import pl.otros.logview.LogData;
import pl.otros.logview.MarkerColors;

public class NullMarker extends AbstractAutomaticMarker {

  private static final String NAME = "'Null' in message";
  private static final String DESCRIPTION = "Marks/unmakrs logs with 'null' in message";
  private static final String[] GROUPS = { "", "Errors" };

  public NullMarker() {
    super(NAME, DESCRIPTION, MarkerColors.Red, GROUPS);
  }

  @Override
  public boolean toMark(LogData data) {
    String m = data.getMessage().toLowerCase();
    return m.contains("null");
  }

}
