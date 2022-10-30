# Shocking
This mod will shock! you every time you take damage in your Minecraft world.

## How to use
You will need some arduino-compatible microcontroller to which you should attach a relay contolling some shocking device of your own design. Then you can you change the pins in `arduino/arduino.ino` according to your needs, and upload it. You can then add the Shocking mod to your mods folder, either using a precompiled jar from the releases, or by compiling it yourself from the source.\
\
*NOTE:* the COM port is hardcoded to /dev/ttyACM0, depending on your OS and config, you may need to change this and recompile the mod.
*NOTE:* the mod will only work in local worlds, as it injects into the PlayerEnity which cannot be reached on an external server.
