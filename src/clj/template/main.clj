(ns template.main
  "Namespace for running the program once"
  (:require
   [template.config :as config]
   [com.stuartsierra.component :as c]
   [trainer.core :refer [new-system]])
  (:gen-class))

(defn -main [& args]
  (c/start (new-system (config/load)))
  (println "Server up and running"))
