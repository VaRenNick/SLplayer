vlcj-player
===========
 
More info will be added after initial phase of development completion

Screenshot
----------

Features
--------

 - audio player
 - video player
 - full-screen
 - audio equalizer
 - video adjustments
 - title selection
 - chapter navigation
 - audio track selection
 - video track selection
 - subtitle track selection
 - load external subtitle file
 - change audio device
 - change playback speed
 - capture and display native logs
 - capture and display video surface debug messages (e.g. to test mouse and keyboard events still work)
 - volume controls
 - mute
 - zoom/scale
 - aspect ratio
 - crop
 - always on top
 - video snapshots
 - redirect native output streams (on Linux)

...and a whole bunch of other nifty stuff.
 

Status
------

This project is currently a work-in-progress.

If you execute "mvn install" or "mvn package", you will get a distribution
package that you can unpack. This will give you the vlcj-player application jar
and all of the dependencies - you can simply execute `java -jar vlcj-player-1.0.0-SNAPSHOT.jar`
and the application should start.

License
-------

The vlcj-player project is provided under the GPL, version 3 or later.
