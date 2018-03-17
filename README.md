# JellyBeans
Write a program called JellyBeans that calculates number of jelly beans in a jar.
The jar holds a specific volume, to determine the number of jelly beans in the jar, we can consider the
usable volume of the jar divided by the volume of a single jelly bean. The jelly beans leave some empty
spaces in the jar, so let’s say they take up 69.8% of the total volume of the jar. Multiply the capacity of
the jar by this percentage (LOAD_FACTOR) to estimate the usable volume.The shape of the jelly beans is not a cylinder, but more like a prolate spheroid
(https://en.wikipedia.org/wiki/Spheroid) so the volume of a single jelly bean can be
estimated with the formula:
(𝝅/𝟔)× 𝑨^𝟐 × 𝑪 
where A is the equatorial diameter and C is the polar diameter (or length). These values can be determined by lining up a sample of the given jelly beans and measuring the distance.
