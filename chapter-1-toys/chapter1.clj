(first [[['hotdogs]] ['and] ['pickle] relish])

(first (first [[['hotdogs]] ['and] ['pickle] relish]))

(rest ['a 'b 'c])

(rest [['a 'b 'c] 'x 'y 'z])

(rest ['hamburger])

(rest [['x] 't 'r])

(rest 'hotdogs)

(rest [])

(first (rest [['b] ['x 'y] [['c]]]))

(rest (rest [['b] ['x 'y] [['c]]]))

(rest (first ['a ['b ['c]] 'd]))


(cons 'peanut ['butter 'and 'jelly])

(cons ['banna 'and] ['peanut 'butter 'and 'jelly])

(cons [['help] 'this] ['is 'very [['hard] 'to 'learn]])

(cons ['a 'b ['c]] [])

(cons 'a [])

(cons [['a 'b 'c]] 'b)

(cons 'a 'b)

(cons 'a (first [['b] 'c 'd]))

(cons 'a (rest [['b] 'c 'd]))

()

(nil? (quote []))

(nil? ['a 'b 'c])

(nil? 'spaghetti)

(atom? 'harry)



(= 'Harry 'Harry)

(= 'margarine 'butter)

(= [] ['strawberry])

(= 6 7)

(= (first ['mary 'had 'a 'little 'lamb 'chop]) 'mary)

(= (rest ['soured 'milk]) 'milk)

(= (first ['beans 'beans 'we 'need 'jelly 'beans]) (first (rest ['beans 'beans 'we 'need 'jelly 'beans])))





















