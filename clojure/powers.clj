(defn p5 [ n ]
  (* n n n n n))

 (println
  (p5 4))
 (defn p7 [ x ]
   (* x x x x x x x))
 (println (p7 2))
(defn power
  [n m ]
  (apply *
         (repeat m n)))
(defn train
  [ n ]
  (if (even? n)
    (println n "is an even number")
    (println n "is an odd number")))

(map train '(1 2 3 4 5))

             
(defn p9
  [ n ]
  (* n n n n n n n n n))
(defn * [ n x ]
  (apply +
         (repeat n x)))
(println "2 to the power of 3 is: " (power 2 3))
(println "10 to the power of 5 is: " (power 10 5))
(map train '(2 6 8 9 6))
(println
 "10 to the power of 6 is:"
 (power 10 6))

(defn p10
  [ n ]
  ( * n n n n n n n n n n))
(defn car
  [ x ]
  (apply *
         (range 1 x)))
(defn p11
  [ a ]
  ( * a a a a a a a a a a a))
(defn p12

  [ x ]

  (* x x x x x x x x x x x x))
(map p12
     '(1 3 5 4 23 7 96))


(println
    "3 to the power of 4 is"
    (power 4 3))

(println "12 to the power of 3 is:"
         (power 12 3))
(println "10 to the power of 10 is:"
         (power 10 10))

(defn divisor? [ m n ]
  (zero? (rem n m)))
(println" is 8 a divisor of 16?"
         (divisor? 8 16))
(println "is 3 a divisor of 20?"
         (divisor? 3 20))
(defn allDivisors?
  [ x ]
  (filter #(divisor? % x)
            (range 1
                   (inc x))))
(println

 "the divisors of 100 is"
 (allDivisors? 100))
(println
 "the divisors of 13 are"
 (allDivisors? 13))
(defn prime?
  [ n ]
  (= (count (allDivisors? n)) 2))
(println " 3 is prime "(prime? 3))
(println
 " 6 is prime " (prime? 3))
(defn p23
  [ n ]
  (* n n n n n n n n n n n n n n n n n n n n n n n))
(defn nmagicaddition
  [ n ]
  (apply + (range 1 (inc n))))
(defn square
  [ m ]
  (* m m))



(println( nmagicaddition 3))
(defn squareamusement
  [ n ]
  (apply + (map square
                (range 1 (inc n)))))
(println " the squareamusement of 3 is"
         (squareamusement 3))
(defn oddanniversary
  [ n ]
  (apply +
                  (filter odd?
                   (range 1
                          (inc n)))))
(println (oddanniversary 7))


(defn theSame [f]
  f)

(println (* 5 5))

(println
 ((theSame *) 5 5))

((theSame println) "foo")

(defn plusOne [f]
  (fn [x]
    (inc (f x))))


(println ( (plusOne square) 5))
(defn plus [ f ]
  (fn [ x ]
    (inc (f x))))

