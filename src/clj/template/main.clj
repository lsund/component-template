(ns template.main
  "Namespace for running the program once"
  (:require
   [template.config :as config]
   [trainer.core :refer [new-system]])
  (:gen-class))

(defn -main [& args]
  (new-system (config/load))
  (println "Server up and running"))
