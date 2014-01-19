(defn lat? [l]
  (cond
    (empty? l) true
    ((not (seq? (first l))) (lat? (rest l)))
    :else false))

(lat? '(bacon and eggs))
(lat? '(bacon '(and eggs))

(defn member? [a lat]
  (cond
    (empty? lat) false
    :else (or (= (first lat) a)
              (member? a (rest lat)))))

(member? 'james '(james lewis))
(member? 'liver '(bacon and lox))
