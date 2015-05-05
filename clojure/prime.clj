
;;; your code goes here!

(defn divisor? [ m n ]
  (zero? (rem  n m)))

(println "is 8 a divisor of 16?"
 (divisor? 8 16))
(println "is 3 a divisor of 20?"
 (divisor? 3 20))
(defn allDivisors
  [ x ]
  (filter #(divisor? % x)
          (range 1 (inc x))))

(println "the divisors of 100 is:" (allDivisors 100))
(println "the divisors of 13 are:" (allDivisors 13))





(defn prime?
  [ n ]
  (= (count (allDivisors n )) 2))

(println "3 is prime? " (prime? 3))
(println "6 is prime? " (prime? 6))