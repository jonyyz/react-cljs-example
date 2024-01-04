(ns react-cljs-test.prod
  (:require [react-cljs-test.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
