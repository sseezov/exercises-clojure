(ns jvm-errors-test
  (:require [clojure.test :refer [deftest run-tests is successful?]]))

(deftest solution-test
  (let [out (with-out-str (load-file "./index.clj"))]
    (is (= out "256\n"))))

(defn check []
  (when-not (successful? (run-tests)) (System/exit 1)))

(check)

