# MetroApp
This is a demo app showcasing Arsalan guru's app development capabilities. The final version will include metro maps of multiple cities along with nearby locations, timings etc.

The project makes use of different technologies, frameworks and libraries, and all the implementations have specific tasks.

Gradle Dependencies: 
https://github.com/arsalanshahid98/MetroApp/blob/42b891f0453d7462bd38efc8c8f54168ab05e420/app/build.gradle#L39-L57

Line 50: material design can be seen implemented to aid into refining the front end of the application.

Line 53 country flags were implemented incase if the application has multiple countries maps in the future it will be able to represent them with flags.

Line 56 the zoom layout is implemented this layout makes use of zoom engine to its full potential, with this implemented the developer will be able to initialize zoom layout and will be able to implement zoom in and out features to any views. The following is the link to its source: https://github.com/guangmomo/ZoomLayout

The following is the work flow screenshots of the project: 

Search Fragment: 

<img src='https://github.com/arsalanshahid98/MetroApp/assets/65215564/d03183d7-4a02-475c-b132-a9812c9bc319' height='400'>

The search fragment, the user can slide the bottom, and it also automatically expands when input fields are clicked.

Map fragment: 

<img src='https://github.com/arsalanshahid98/MetroApp/assets/65215564/b34adc36-b1b4-4534-8124-cb71f1a34b8a' height='400'>
<img src='https://github.com/arsalanshahid98/MetroApp/assets/65215564/68efecd4-97a1-46fa-81d0-cd181c44380e' height='400'>
<img src='https://github.com/arsalanshahid98/MetroApp/assets/65215564/cc3416e4-b923-481a-a419-0863db47e9cc' height='400'>

The map fragment displaying the map you can zoom in and zoom out.

Destination time activity: 

<img src='https://github.com/arsalanshahid98/MetroApp/assets/65215564/006d6099-f25a-4812-aa81-1429f8adeffd' height='400'>

After setting up to and from stations in the map or search fragments the user will be directed to destination time activity where the user will be able view the time which will take to reach the destination and the trip fair.

Station properties: 

<img src='https://github.com/arsalanshahid98/MetroApp/assets/65215564/6d2cfe21-04d1-45dc-823d-3c085de9e53a' height='400'>

When the user clicks the properties in the dropdown for the station, they will be directed to the station property page where they will be able to view the station’s opening and closing times and the station address which the user can copy paste it into the nearby fragments in the search bar to perform search query locate that particular station.

Settings fragment: 

<img src='https://github.com/arsalanshahid98/MetroApp/assets/65215564/c0d017c3-9f01-41ee-85bd-0ad574ec9ee7' height='400'>

The settings fragment has location and about in its settings, in location the user will be able to set their location preferences and in about the user will be able to view the application properties.
