(ns template.main
  "Namespace for running the program once"
  (:gen-class)
  (:require [com.stuartsierra.component :as c]
            [template.config :as config]
            [template.core :refer [new-system]]))

(defn -main [& args]
  (c/start (new-system (config/read)))
  (println "Server up and running"))
