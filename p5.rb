#!/usr/bin/ruby

a = [11,12,13,14,15,16,17,18,19,20]
b = [12,13,14,15,16,17,18,19]
st = 2520

while 1 == 1 do

st = st + 220 ## (a[0]*a[-1])
b.map {|s| st % s }.compact
if (b.length == 1 and b[0] == 0)
	puts st
end

end
