# Home-Security-Project
  This project was done in my First Year Second Semester.

## Overview
This is a home security system which uses Raspberry Pi 3, PIR sensor is used to detect the presence of an intruder using 
passive infrared rays. This triggers the Pi Camera which is also connected to the RPi. The Pi camera captures the image
and stores it in the firebase. You will receive an email containing pics of the intruder and also an alert on the Home Security Android app which we created. You just need to install this on the front door of your house and you're all set!

## Requirements
1. Raspberry Pi 3
2. Pi Camera
3. PIR Sensor
4. Smartphone with Android OS
5. Jumper Wires
6. Power Supply

## Running the project
1. Connect the RPi to the external power source,insert the pi camera in the pi camera slot on the Rpi,connect the PIR sensor to few of the GPIO pins on the Rpi using jumper wires
2. Install the "Security System" apk on your Android smartphone.
3. Enter your email and password to link your email account for receiving images.
4. Run the python code on any IDE on the RPi
5. After the code starts running, the PIR sensor turns ON, any motion detected by the PIR sensor will trigger the pi camera and an image will be captured.
6. The captured image will be sent to your Android app as the image is stored in the firebase.
