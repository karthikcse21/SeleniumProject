#The Actions class in Selenium has several methods and properties that can be used to simulate user interactions with a web page
#Methods:
#click: Simulates a mouse click on an element.
#clickAndHold: Clicks and holds down the mouse button on an element.
#doubleClick: Performs a double-click on an element.
#keyDown: Simulates pressing a key on the keyboard.
#keyUp: Simulates releasing a key on the keyboard.
#moveToElement: Moves the mouse cursor over an element.
#release: Releases the mouse button.
#sendKeys: Simulates typing text on the keyboard.
#perform: Executes the defined actions.

@Mouseover
Feature: Test Cases for Mouseover Actions

  @TooltipOnMouseover
  Scenario: Verify Tooltip Display on Mouseover
            Verify that a tooltip is displayed when the user hovers over a specific element

    Given the user Navigate to the webpage
    And Hover over the target element
    Then Verify that the tooltip is displayed
