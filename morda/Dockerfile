FROM nginxinc/nginx-unprivileged:1.22-alpine

COPY build/ /var/www/build/
COPY nginx.conf /etc/nginx/nginx.conf

EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]