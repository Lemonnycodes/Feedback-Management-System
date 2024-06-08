FROM node:latest as node
WORKDIR /app
COPY . .
RUN npm install
RUN npm run build --prod
# Stage 2
FROM nginx:alpine

COPY nginx.config /etc/nginx/conf.d/default.conf
COPY --from=node /app/dist/surveyform /usr/share/nginx/html