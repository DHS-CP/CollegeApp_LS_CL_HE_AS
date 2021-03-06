# CollegeApp_LS_CL_HE_AS


===== README.txt ========

Assignment: PLTW 2.1.4
Date: (date submitted)
Team Members: Camryn Lee, Latisha Sumardy, Arina Sobol, Hannah Edge

Description: (please summarize what you learned based on topics covered.  Please include a summary of the presentation on variable scope. Also, look up
The "Model View Presenter" design pattern and summarize as part of this section.  Compare
MVP to MVC. (NOTE: Friday's quiz include questions on variable scope in Java)

This assignment was a lesson in app navigation. We learned how to create the basic foundation of the College App using Android Studio. A large part of the lesson focused on fragments of the app, and how each fragment contains a separate part such as user profile, or family member information. We also learned about variables, and the extent to which they can be used. Static variables and instance variables have a class level scope, meaning they can be used by all the methods within the class. Parameters and local variables are limited to the method they were written in.

The  "Model View Presenter" is derived from the "Model View Controller" and it is a key factor when trying to design the user interface of an app. Each part has its own role. The model is made to analyze the data, view displays data reacts based upon user input, and presenter displays the data. MVP is different than MCP because MCP has a controller that controls what is going to be displayed in view. 


Team member roles in assignment: 

We each worked collaboratively throughtout the activity.

Part I: This part was relatively simple, as we just went over the basics of starting the app, and how to use Android's Vector Asset Studio. We went over how to add and delete icons in the menu tab the importance of variable scope (explained in the summary above). 


Part II: In this part, we learned how to organize our apps using fragments. The importance of using fragments, is it allows you to store different information onto different pages, instead of having everything jumbled into one. We learned that each fragment required its own class and xml file to manage all the data and functions of the buttons. 


Part III: In this section, they emphasized the importance of protecting personal information from malicious users, and we all pledged to 'do the right thing.'


In the app you are writing, what data could represent private information? : The app asks for profile information and information on family members. Anything personal about an individual is information that would require protection because it represents private inforamtion. 


As a responsible programmer, how could you create a trusted app that would protect your users' privacy?: We could create an app that has encrypted accounts, so it would be difficult for malicious users to gain access to our users' personal information.

Activity Questions:

#36: A navigation drawer is a good fit for the College App because it allows for the users to easily switch between different fragments of their apps without having to push a back button multiple times to get to the main screen. It acts as a shortcut that allows you to jump from one screen to another. 

#37: 

Source1: https://material.io/guidelines/patterns/navigation-drawer.html# (This site has a clear description on what a navigation drawer is and the types of behaviors they could be designed to have)

Source2:https://stablekernel.com/using-fragments-to-simplify-android-navigation-drawers/ (This site talks about how to use fragments to simplify your naviagtion drawer)

Source3: https://www.uxpin.com/community/tutorials/navigation-drawers/ (This source teaches you how to build a navigation drawer)

Conclusion Questions

Which layers of the MVP pattern are currently present in the College App?
nav_header_applicant.xml contains the layout information for the green header area of the Navigation Drawer, which has the Android icon in it.
ApplicantActivity.java contains presenter layer code for the app.
activity_applicant.xml contains the overall layout of the main activity.
app_bar_applicant.xml contains layout information for the blue bar at the top of the screen and the pink floating action button circle.
content_applicant.xml contains the layout information for the main section of the screen, displaying “Hello World!” with a light grey background.
activity_applicant_drawer.xml contains the layout information for the menu items found in the Navigation Drawer, like Import and Share.
applicant.xml contains the layout information for the menu that appears when a user taps the icon (three dots)to the far right of the blue action bar.


Of the layers that you listed in the previous question, what parts of the College App belong to which layers?
Activity_applicant_drawer.xml
Activity_applicant_drawer.xml
ApplicantActivity
content_applicant.xml


How did you use inheritance in the College App?
We used inheritance in the college app by extending ApplicantActivity.java from AppCompatActivity and the fragment classes from Fragment.


Would you prefer to use the navigation drawer implementation provided by Google or create your own? Why?
Using the google implementation would probably save more time then doing your own, but when you do your own it may be easier to understand.


Use the Internet or any other resource to help you find information about three other forms of navigation used within Android apps. Discuss the pros and cons of using each as a replacement for the navigation drawer in the College App.
Tabs = refers to action bar tabs.

Tabs+Swipe= refers to using view page in conjunction with action bar tabs
Swipe View + Title Strip = refers to using a viewpager with a pagerTabStrip instead of actionbar tabs
Dropdown = refers to using list navigation in the action bar


---------------------------------


2.1.5 


Summaries:

Part 1: Viewing the Model Data
In part one we created a family member class which takes in your first and last name. We added getters and setters and updated the TextViews and EditTexts. Then we added a family memeber constructer.

Part 2: User input:Text Fields
We added a submit button onto the family memeber fragment which you could click on and it sends your submition. We also aadded a onclicklistener button.

Part 3: Abstract Classes
The next class we created was the sibling and guardian classes, family memeber was the superclass of the gairdian and sibling  classes.Declared that familymemeber was an abstract between public and class.

Part 4: Date of birth picker
The very last part of this assignment is basically showing which family memeber did what in high school/college. Showing what tests they took, random interesting facts about family memebers.

Why should Guardian and Sibling inherit from FamilyMember?
Gaurdian and sibling  is inherited from family memeber because we needed the same code that is in family memeber and it was just eaiser to inherit from FamilyMember so we don't have to create more usueless classes.

Why doesn't it make sense to instantiate FamilyMember?
you instantiate a class to create a specific class that can also be an executable file you can run in a computer we don't need familymember to run on our computer file.
===== README.txt ========
