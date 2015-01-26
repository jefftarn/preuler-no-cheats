#!/usr/bin/ruby

# The prime factors of 13195 are 5, 7, 13 and 29.

# What is the largest prime factor of the number 600851475143 ?


# brute force?   see you tmrw?

require 'prime'

m = 600851475143
n = m -1  


while n != 1 do 
	if Prime.prime?(n) && m % n == 0 
		puts n
		exit
	end
	n = n -1
end