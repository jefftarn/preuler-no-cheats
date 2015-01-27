#!/usr/bin/ruby


## skip check on values 1-10 b/c anything evenly divisble by 11-20 will 
## also be divisible by 1-10
a = [11,12,13,14,15,16,17,18,19,20]
b = [12,13,14,15,16,17,18,19]
st = 0

while 1 == 1 do

	# increment 11 * 20, dont check those
	st = st + 220 ## 

	c = b.map {|s| st % s }.uniq ## dont check 1st and last, b/c those are in the increment

	if (c.length == 1 and c[0] == 0)
		puts st
		exit
		
	end

end





## noticing the increment iat 220 is too low
