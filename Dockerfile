FROM debian

RUN ["apt-get", "update"]
RUN ["apt-get", "install", "-y", "vim"]

RUN  apt-get -y install postgresql

