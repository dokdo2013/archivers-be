package com.archivers.backend.streamer

import jakarta.persistence.*

//create table public.streamer
//(
//id                  serial
//constraint streamer_pk
//primary key,
//twitch_id           integer,
//twitch_name         varchar(64),
//twitch_display_name varchar(64),
//profile_image_url   text,
//subscribe_start     timestamp with time zone default CURRENT_TIMESTAMP,
//subscribe_end       timestamp with time zone,
//memo                text,
//issuer_id           integer,
//created_at          timestamp with time zone default CURRENT_TIMESTAMP,
//updated_at          timestamp with time zone default CURRENT_TIMESTAMP,
//deleted_at          timestamp with time zone,
//default_expire_days integer                  default 7,
//space_id            integer                  default 1
//);
//
//comment on table public.streamer is '녹화대상 스트리머';
//
//comment on column public.streamer.twitch_id is 'Twitch user id';
//
//comment on column public.streamer.twitch_name is 'Twitch user name';
//
//comment on column public.streamer.twitch_display_name is 'Twitch Display Name';
//
//comment on column public.streamer.profile_image_url is 'profile image url';
//
//comment on column public.streamer.default_expire_days is '기본 만료일자';
//
//alter table public.streamer
//owner to postgres;
//
//grant select, update, usage on sequence public.streamer_id_seq to anon;
//
//grant select, update, usage on sequence public.streamer_id_seq to authenticated;
//
//grant select, update, usage on sequence public.streamer_id_seq to service_role;
//
//create index streamer_created_at_index
//on public.streamer (created_at);
//
//create index streamer_subscribe_start_index
//on public.streamer (subscribe_start);
//
//create index streamer_twitch_display_name_index
//on public.streamer (twitch_display_name);
//
//create index streamer_twitch_id_index
//on public.streamer (twitch_id);
//
//create index streamer_twitch_name_index
//on public.streamer (twitch_name);
//
//create index streamer_space_id_index
//on public.streamer (space_id);
//
//grant delete, insert, references, select, trigger, truncate, update on public.streamer to anon;
//
//grant delete, insert, references, select, trigger, truncate, update on public.streamer to authenticated;
//
//grant delete, insert, references, select, trigger, truncate, update on public.streamer to service_role;
//


@Entity
@Table(name = "streamer")
@Suppress("JpaDataSourceORMInspection")
data class StreamerEntity(
    val twitchId: Int,
    val twitchName: String,
    val twitchDisplayName: String,
    val profileImageUrl: String,
    val subscribeStart: String,
    val subscribeEnd: String,
    val memo: String,
    val issuerId: Int,
    val createdAt: String,
    val updatedAt: String,
    val deletedAt: String,
    val defaultExpireDays: Int,
    val spaceId: Int
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0
}
