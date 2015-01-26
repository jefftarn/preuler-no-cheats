#!/usr/bin/ruby

# The prime factors of 13195 are 5, 7, 13 and 29.

# What is the largest prime factor of the number 600851475143 ?

m = 600851475143


primes = [2]  # lets start with this, b/c we know this is the prime to start

#create my range.  exclude everything divisible by 2
r = (primes[-1]+1..m).to_a.select {|x| x % 2 != 0 }

while r.length() != 0 do
	first_in_ss = r[0]
	puts first_in_ss
	primes << first_in_ss ## should be prime if we have not pulled it out 
	not_prime = r.select {|x| x % first_in_ss == 0 }
	r = r - not_prime
end

puts primes.reverse.find {|x| m % x == 0}