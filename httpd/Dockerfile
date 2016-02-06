FROM ubuntu
 
ENV DEBIAN_FRONTEND noninteractive
 
RUN apt-get update \
    && apt-get install -y --no-install-recommends apache2 \
                            libapache2-mod-jk

RUN a2enmod proxy proxy_ajp proxy_http rewrite deflate headers proxy_balancer proxy_connect proxy_html

RUN a2enmod lbmethod_byrequests slotmem_shm

VOLUME ["/var/log/apache2"]
EXPOSE 80 443
 
COPY ./my-site.conf /etc/apache2/sites-enabled/000-default.conf

ENTRYPOINT ["apache2ctl", "-D", "FOREGROUND"]

