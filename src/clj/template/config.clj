(ns template.config
  "Configuration handling"
  (:require [clojure.edn :as edn]))

(defn read []
  (edn/read-string (slurp "resources/edn/config.edn")))
