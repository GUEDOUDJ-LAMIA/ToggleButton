# ToggleButton
#### A ToggleButton is a special control having the ability to be selected. Basically, ToggleButton is rendered similarly to a Button but these two are the different types of Controls. A Button is a “command” button that invokes a function when clicked. But a ToggleButton is a control with a Boolean indicating whether it is selected. It inherits the ButtonBase class.

#### ToggleButton can also be placed in groups. By default, a ToggleButton is not in a group. When in groups, only one ToggleButton at a time within that group can be selected. To put two ToggleButtons in the same group, simply assign them both the same value for ToggleGroup. Unlike RadioButtons, ToggleButtons in a ToggleGroup does not attempt to force at least one selected ToggleButton in the group. Means, if a ToggleButton is selected, clicking on it will cause it to become unselected. With RadioButton, clicking on the selected button in the group will have no effect.

#### Constructors of the class:

    ToggleButton(): Creates a toggle button with an empty string for its label.
    ToggleButton(String txt): Creates a toggle button with the specified text as its label.
    ToggleButton(String txt, Node graphic): Creates a toggle button with the specified text and icon for its label.

<img> https://github.com/GUEDOUDJ-LAMIA/ToggleButton/issues/1#issue-1146907218 </img>
