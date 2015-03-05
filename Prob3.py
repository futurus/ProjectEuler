primes = [2]
factors = []
num = 600851475143

while num > 1:
    # find factors
    p = max(primes)
    
    # looking for prime factor
    while num % p == 0:
        if p in factors:
            continue
        else:
            factors.append(p)
        num = num / p
    
    # find next prime
    for i in range(max(primes), max(primes)+1000):
        prime = True
        for p in primes:
            if i % p == 0:
                prime = False
                break

        if prime:
            primes.append(i)
            break

print(factors)