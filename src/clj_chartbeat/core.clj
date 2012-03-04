(ns clj-chartbeat.core
  (:require [clj-http.client :as client])
  (:use [clojure.string :only [join]]))

(def live-url "http://api.chartbeat.com/live/")
(def p {"api-key" "3d56df86832d3188b01d4ae8613427cb"
        "host" "scriptor.github.com"})

(defn build-url [api-call]
  (str live-url api-call "/?"))

(defn recent []
  (client/get (build-url "recent")
              {:query-params p}))