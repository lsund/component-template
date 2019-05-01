(ns template.core
  "Component system map"
  (:require [com.stuartsierra.component :as c]
            [template.app :as app]
            [template.db :as db]
            [template.server :as server]))

(defn new-system [config]
  (c/system-map :server (c/using (server/new-server (:server config))
                                 [:app])
                :app (c/using (app/new-app (:app config))
                              [:db])
                :db (c/using (db/new-db (:db config))
                             [])))
