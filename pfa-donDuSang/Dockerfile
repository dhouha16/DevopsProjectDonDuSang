# Use the official Node.js v16.15.0 image as the base
FROM node:16.15.0
RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app

COPY package*.json ./
RUN npm i npm@latest -g
RUN npm install -f

COPY . .    
RUN npm run build

# # Stage 2
# FROM nginx:1.13.12-alpine

# COPY --from=node /usr/src/app/dist /usr/share/nginx/html
# COPY ./nginx.conf /etc/nginx/conf.d/default.conf
