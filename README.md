# DataBindingDemo

# Demonstration of DataBinding

The Data Binding Library is a support library that allows you to bind UI components in your layouts to data sources in your app using a declarative format rather than programmatically.

DataBinding is one of the android architecture components suggested by android.

Use the following steps to use data binding:

# Step1 . Enabling DataBinding

To configure your app to use data binding, add the dataBinding element to your build.gradle file in the app module:

android {
    dataBinding {
        enabled = true
    }
}

# Step 2. Create POJO

Let’s say we want to display user information from a User POJO class.
We generally display the info in a TextView using setText() method. 
But instead of manually calling setText for each user property, DataBinding allows us to bind the values automatically.

# Step 3. Enable Data Binding in layout

Data binding layout files are slightly different and start with a root tag of layout followed by a 
data element and a view root element. This view element is what your root would be in a non-binding layout file.
Refer to activity_main.xml file of my project.

a) The layout should have <layout> as root element. Inside <layout> the usual code of layout will be placed.

b) Inside <data> tags, a variable will be declared using <variable> tag. 

The variable tag takes two attributes `name` and `type`. name attribute will be alias name and type should be of object model class. In our case, path to User class.

c) To bind a value, @ annotation should be used. In the below layout, user name and email are bound to TextView using @{user.name} and @{user.email}

Once data binding is integrated in layout file, goto Build -> Clean Project and Build -> Rebuild Project. This will generate necessary binding classes.

The generated binding classes follows the naming convention considering the layout file name in which binding is enabled. For the layout activity_main.xml, the generated binding class will be ActivityMainBinding (Binding suffix will be added at the end).

# Step 4. Binding Data

Here layout filename is activity_main.xml so the corresponding generated class is ActivityMainBinding. 

This class holds all the bindings from the layout properties (for example, the user variable) to the layout's views 

and knows how to assign values for the binding expressions.

ActivityMainBinding inflates the layout first and binding.setUser() binds the User object to layout.

Please check the code of MainActivity.java






