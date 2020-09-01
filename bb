port: 7890
socks-port: 7891
allow-lan: true
mode: Rule
log-level: info
external-controller: 127.0.0.1:9090
dns:
  enable: true
  listen: 0.0.0.0:53
  default-nameserver:
    - 223.5.5.5
    - 1.0.0.1
  ipv6: false
  enhanced-mode: fake-ip
  fake-ip-range: 198.10.0.1/16
  nameserver:
    - 119.29.29.29
    - https://dns.alidns.com/dns-query
Proxy:
  - name: VV-TencentGZ
    server: 106.52.167.55
    port: 443
    type: ss
    cipher: chacha20-ietf
    password: aa1234
  - name: VV-Aliyun
    server: 106.15.44.143
    port: 443
    type: ss
    cipher: chacha20-ietf
    password: aa1234
  - name: VV-TencentSH
    server: 106.54.6.226
    port: 443
    type: ss
    cipher: chacha20-ietf
    password: aa1234
Proxy Group:
  - name: PROXY
    type: select
    proxies:
      - DIRECT
      - VV-TencentGZ
      - VV-Aliyun
      - VV-TencentSH
Rule:
  - DOMAIN-SUFFIX,acfun.cn,PROXY
  - DOMAIN-SUFFIX,acfun.com,PROXY
  - DOMAIN-SUFFIX,aixifan.com,PROXY
  - DOMAIN-SUFFIX,acgvideo.com,PROXY
  - DOMAIN-SUFFIX,bilibili.com,PROXY
  - DOMAIN-SUFFIX,hdslb.com,PROXY
  - DOMAIN-SUFFIX,hitv.com,PROXY
  - DOMAIN-SUFFIX,hunantv.com,PROXY
  - DOMAIN-SUFFIX,mgtv.com,PROXY
  - DOMAIN-SUFFIX,cmvideo.cn,PROXY
  - DOMAIN-SUFFIX,migu.cn,PROXY
  - DOMAIN-SUFFIX,miguvideo.com,PROXY
  - DOMAIN-SUFFIX,iqiyi.com,PROXY
  - DOMAIN-SUFFIX,iqiyipic.com,PROXY
  - DOMAIN-SUFFIX,qy.net,PROXY
  - DOMAIN-SUFFIX,sohu.com,PROXY
  - DOMAIN-SUFFIX,sohu.com.cn,PROXY
  - DOMAIN-SUFFIX,itc.cn,PROXY
  - DOMAIN-SUFFIX,v-56.com,PROXY
  - DOMAIN-SUFFIX,video.qq.com,PROXY
  - DOMAIN-SUFFIX,soku.com,PROXY
  - DOMAIN-SUFFIX,youku.com,PROXY
  - DOMAIN-SUFFIX,ykimg.com,PROXY
  - DOMAIN-SUFFIX,xiami.com,PROXY
  - DOMAIN-SUFFIX,xiami.net,PROXY
  - DOMAIN-SUFFIX,music.126.net,PROXY
  - DOMAIN-SUFFIX,music.163.com,PROXY
  - DOMAIN-SUFFIX,qqmusic.qq.com,PROXY
  - DOMAIN-SUFFIX,y.qq.com,PROXY
  - DOMAIN,aqqmusic.tc.qq.com,PROXY
  - DOMAIN-SUFFIX,kugou.com,PROXY
  - DOMAIN-SUFFIX,kuwo.cn,PROXY
  - DOMAIN-SUFFIX,koowo.com,PROXY
  - DOMAIN-SUFFIX,qianqian.com,PROXY
  - GEOIP,CN,PROXY
  - MATCH,DIRECT
