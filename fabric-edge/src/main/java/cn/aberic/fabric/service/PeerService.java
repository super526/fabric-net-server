/*
 * Copyright (c) 2018. Aberic - aberic@qq.com - All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.aberic.fabric.service;

import cn.aberic.fabric.dao.Peer;

import java.util.List;

/**
 * 作者：Aberic on 2018/6/27 22:03
 * 邮箱：abericyang@gmail.com
 */
public interface PeerService {
    
    int add(Peer peer);

    int update(Peer peer);

    List<Peer> listAll();

    List<Peer> listById(int id);

    Peer get(int id);

    int countById(int id);

    int count();

    int delete(int id);
}
