;; Copyright © 2014-2017, JUXT LTD.

(def VERSION "1.2.2")

(defproject yada/oauth2 VERSION
  :pedantic? :abort
  :exclusions [commons-codec]
  :dependencies [[yada/core ~VERSION]
                 [yada/jwt ~VERSION]
                 [yada/json ~VERSION]
                 [commons-codec "1.10"]])
